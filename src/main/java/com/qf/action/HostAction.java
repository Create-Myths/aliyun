package com.qf.action;

import com.qf.dto.HostDTO;
import com.qf.dto.OsDTO;
import com.qf.pojo.YunHost;
import com.qf.pojo.YunHostaccount;
import com.qf.pojo.YunInetdata;
import com.qf.pojo.YunOs;
import com.qf.service.HostService;
import com.qf.service.OsService;
import com.qf.service.YunHostaccountService;
import com.qf.service.YunInetdataService;
import com.qf.util.LinuxUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Thanks for Everything.
 */
@Controller
public class HostAction {

	//调用服务层
	@Autowired
	private HostService hostService;
	@Autowired
	private OsService osService;
	@Autowired
	private YunInetdataService yunInetdataService;

	@Autowired
	private YunHostaccountService yunHostaccountService;

	@ResponseBody
	@RequestMapping("/gethostlist.json")//对应页面脚本中的请求地址
	public List<HostDTO> gethostlist(HttpServletRequest request){
		String hostName = request.getParameter("hostName");
		List<HostDTO> byName = hostService.findByName(hostName);
		//封装和页面一致，就是和JSON解析的一致，显示到页面上。
		return byName;
	}

	@ResponseBody
	@RequestMapping("/GetOsList.json")
	public Map<String,Object> getos(){
		List<YunOs> os = osService.findOs();
		List<OsDTO> linuxList = new ArrayList<OsDTO>();
		List<OsDTO> windowsList = new ArrayList<OsDTO>();
		for (YunOs o : os) {
			OsDTO osDTO = new OsDTO();
			osDTO.setId(o.getOsid());
			osDTO.setName(o.getOsname());
			if(o.getOstype().equalsIgnoreCase("Linux")) {
				linuxList.add(osDTO);
			}else if(o.getOstype().equalsIgnoreCase("windows")){
				windowsList.add(osDTO);
			}
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Linux",linuxList);
		map.put("windows",windowsList);
		return map;
	}

	@ResponseBody
	@RequestMapping("/CreateHost.json")
	public Map<String,Object> creatHost(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		String hostName = request.getParameter("hostName");
		String os = request.getParameter("os");
		String cpu = request.getParameter("cpu");
		String ram = request.getParameter("ram");
		String dataDiskSize = request.getParameter("dataDiskSize");
		String count = request.getParameter("count");
		String bandwidth = request.getParameter("bandwidth");//如果加加到数据中心表
		String memo = request.getParameter("memo");
		YunHost yunHost = new YunHost();
		//完善
		String hostType = request.getParameter("hostType");
		yunHost.setConfigid(Long.parseLong(hostType));
		//服务端分配IP
		//内网IP
		Random random = new Random();
		int i1 = random.nextInt(255);
		String inIp = "192.168.2."+i1;
		yunHost.setInip(inIp);
		//外网IP
		yunHost.setOutip("101.201.23."+i1);
		yunHost.setHstate((short)1);

		String buyTypestr = request.getParameter("buyType");
		int butType = Integer.parseInt(buyTypestr);
		yunHost.setBuytype(butType);
		String buyCountStr = request.getParameter("buyCount");
		int buyCount = Integer.parseInt(buyCountStr);
		yunHost.setBuytime(buyCount);
		//从当前时间开始计算，往后推几年或者几个月
		//得到当前时间的年月日
		Calendar instance = Calendar.getInstance();
		int year = instance.get(Calendar.YEAR);
		int month = instance.get(Calendar.MONTH);//[0-11]
		int day = instance.get(Calendar.DAY_OF_MONTH);
		if(butType==1){//按照年
			year=year+buyCount;//当前时间加几年
		}else if(butType==2){//按照月
			month = month+buyCount;
			if(month>=12){
				year= year+(month/12);
				month = month%12;
			}
		}//再次设置时间就是最后的过期时间,月的范围[0-11]
		instance.set(year,month,day);
		yunHost.setExptime(instance.getTime());
		yunHost.setCreatetime(new Date());

		yunHost.setUid(1L);//默认用户,做登录后从session中取
		yunHost.setHostname(hostName);
		yunHost.setOsid(Long.parseLong(os));
		yunHost.setCpu(cpu);
		yunHost.setRam(ram);
		yunHost.setDatadisksize(dataDiskSize);
		yunHost.setBuysum(Integer.parseInt(count));
		yunHost.setMemo(memo);

		//关联数据中心表添加记录
		YunInetdata yunInetdata = new YunInetdata();
		String region = request.getParameter("region");
		yunInetdata.setDatatypeid(Long.parseLong(region));
		String line = request.getParameter("line");
		yunInetdata.setInet(line);
		String speedType = request.getParameter("speedType");
		yunInetdata.setBandtype(speedType);
		yunInetdata.setBandwidth(bandwidth);
		//添加到数据中心表，同时得到返回的主键，再次添加到主表主机表。
		Long dataid = yunInetdataService.addYunInetData(yunInetdata);
		yunHost.setDataid(dataid);//设置关联字段

		//关联云主机账户，添加到主机账户表
		YunHostaccount yunHostaccount = new YunHostaccount();
		String admin_user = request.getParameter("admin_user");
		yunHostaccount.setHostname(admin_user);
		String admin_account = request.getParameter("admin_account");
		yunHostaccount.setManagername(admin_account);
		String admin_password = request.getParameter("admin_password");
		yunHostaccount.setManagerpass(admin_password);
		//添加到账户表，得到账户表的主键，再添加到主机表
		Long accountid = yunHostaccountService.addYunHostCount(yunHostaccount);
		//得到关联表的主键，设置到主表中
		yunHost.setAccountid(accountid);

		int i = hostService.addHost(yunHost);
		if(i>0){//添加成功
			map.put("result","true");
			map.put("errortype",0);
			map.put("errormsg","");
			map.put("param","");
		}else{
			map.put("result","false");
			map.put("errortype",-1);
			map.put("errormsg","添加失败");
			map.put("param","");
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("/starthost.json")
	public Map<String,Object> starthost(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		String hostId = request.getParameter("hostId");
		//根据主机id找到具体主机的ip：根据主键查询。

		//给对应的ip发送linux指令，操作这台服务器。
		int execute = LinuxUtils.execute("10.0.121.116", "root", "123", "reboot");
		if(execute>0){//添加成功
			map.put("result","true");
			map.put("errortype",0);
			map.put("errormsg","");
			map.put("param","");
		}else{
			map.put("result","false");
			map.put("errortype",-1);
			map.put("errormsg","重启失败");
			map.put("param","");
		}
		return map;
	}

	@ResponseBody
	@RequestMapping("/shutdown.json")
	public Map<String,Object> shutdown(HttpServletRequest request){
		Map<String,Object> map = new HashMap<String,Object>();
		String hostId = request.getParameter("hostId");
		//根据主机id找到具体主机的ip：根据主键查询。

		//给对应的ip发送linux指令，操作这台服务器。
		int execute = LinuxUtils.execute("10.0.121.116", "root", "123", "shutdown -h now");
		//关机成功后需要更新状态state =0

		if(execute>0){//添加成功
			map.put("result","true");
			map.put("errortype",0);
			map.put("errormsg","");
			map.put("param","");
		}else{
			map.put("result","false");
			map.put("errortype",-1);
			map.put("errormsg","重启失败");
			map.put("param","");
		}
		return map;
	}

}
