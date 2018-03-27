package com.qf.action;

import com.qf.dto.BalancerDTO;
import com.qf.pojo.YunLoadbalancing;
import com.qf.service.BalancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BalancerAction {

    @Autowired
    private BalancerService balancerService;

    //获取负载均衡列表
    @RequestMapping("/GetBalancerList.json")
    @ResponseBody
    public Map<String,Object> getdnsList(){
        Map<String,Object> map1 = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        List<BalancerDTO> list = balancerService.getdnsList();
        map1.put("result","true");
        map1.put("errortype","0");
        map1.put("errormsg","");
        map2.put("BalancerList",list);
        map1.put("param",map2);
        return map1;
    }

    //添加负载均衡
    @RequestMapping("/CreateBalancerAndRole.json")
    @ResponseBody
    public Map<String,Object> addBalancer(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        String line = request.getParameter("line");
        String region = request.getParameter("region");
        String buyType = request.getParameter("buyType");
        String buyCount = request.getParameter("buyCount");
        String bindwidth = request.getParameter("bindwidth");
        String bport = request.getParameter("bport");
        String port = request.getParameter("port");
        String kepp_alive = request.getParameter("kepp_alive");
        String heath_check = request.getParameter("heath_check");
        String role_type = request.getParameter("role_type");
        String name = request.getParameter("name");
        String url = request.getParameter("url");
        String pool = request.getParameter("pool");

        YunLoadbalancing yunLoadbalancing = new YunLoadbalancing();
        if (line.equals("电信")){
            yunLoadbalancing.setLine(Short.parseShort("1"));
        }else if (line.equals("联通")){
            yunLoadbalancing.setLine(Short.parseShort("2"));
        }else if (line.equals("双线")){
            yunLoadbalancing.setLine(Short.parseShort("3"));
        }
        yunLoadbalancing.setLoadname(name);
        yunLoadbalancing.setBuytype(Integer.parseInt(buyType));
        yunLoadbalancing.setBuynum(Integer.parseInt(buyCount));
        yunLoadbalancing.setBandwidth(bindwidth);
        yunLoadbalancing.setMonitorport(Integer.parseInt(port));
        yunLoadbalancing.setCheckhealth(Short.parseShort(heath_check));
        yunLoadbalancing.setKeepsession(Short.parseShort(kepp_alive));
        yunLoadbalancing.setUid(Long.parseLong(role_type));
        yunLoadbalancing.setDomain(url);
        yunLoadbalancing.setPool(pool);
        yunLoadbalancing.setCreatetime(new Date());
        int i = balancerService.addBalancer(yunLoadbalancing);
        if (i > 0) {  //挂载成功
            map.put("result", "true");
            map.put("errortype", "0");
            map.put("errormsg", "挂载成功");
            map.put("param", "");
        } else {
            map.put("result", "false");
            map.put("errortype", "-1");
            map.put("errormsg", "");
            map.put("param", "");
        }
        return map;
    }

    //删除负载均衡
    @RequestMapping("/DeleteBalancer.json")
    @ResponseBody
    public Map<String, Object> deleteBalancer(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String id = request.getParameter("id");
        int i = balancerService.deleteBalancer(Long.parseLong(id));
        if (i > 0) {   //删除成功
            map.put("result", "true");
            map.put("errortype", "0");
            map.put("errormsg", "删除成功");
            map.put("param", "");
        } else {
            map.put("result", "false");
            map.put("errortype", "-1");
            map.put("errormsg", "");
            map.put("param", "");
        }
        return map;

    }



}
