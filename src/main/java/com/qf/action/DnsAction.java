package com.qf.action;

import com.qf.dto.DnsDTO;
import com.qf.pojo.YunDns;
import com.qf.service.DnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DnsAction {

    @Autowired
    private DnsService dnsService;

    //获取域名列表
    @RequestMapping("/ListDomain.json")
    @ResponseBody
    public Map<String,Object> getdnsList(){
        Map<String,Object> map1 = new HashMap<String,Object>();
        List<DnsDTO> list = dnsService.getdnsList();
        map1.put("result","true");
        map1.put("errortype","0");
        Map<String,Object> map2 = new HashMap<String,Object>();
        map1.put("param",map2);
        map1.put("errormsg","");
        map2.put("domains",list);

        return map1;
    }


    //添加域名
    @RequestMapping("/AddDomain.json")
    @ResponseBody
    public Map<String,Object> addDns(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        YunDns yunDns = new YunDns();
        yunDns.setHid(Long.parseLong("10"));
        String domain = request.getParameter("domain");
        yunDns.setDomain(domain);

        int i = dnsService.addDns(yunDns);
        if (i>0) {  //添加成功
            map.put("result","true");
            map.put("errortype","0");
            map.put("errormsg","");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype","-1");
            map.put("errormsg","");
            map.put("param","");
        }
        return map;
    }

    //删除域名
    @RequestMapping("/DelDomain.json")
    @ResponseBody
    public Map<String,Object> deleteDns(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        String id = request.getParameter("domain_id");
        int i = dnsService.deleteDns(Long.parseLong(id));
        if (i>0){   //删除成功
            map.put("result","true");
            map.put("errortype","0");
            map.put("errormsg","");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype","-1");
            map.put("errormsg","删除失败");
            map.put("param","");
        }
        return map;
    }
}
