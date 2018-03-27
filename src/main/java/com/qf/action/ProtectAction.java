package com.qf.action;

import com.qf.dto.ProtectDTO;
import com.qf.pojo.YunProtect;
import com.qf.service.ProtectService;
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
public class ProtectAction {

    @Autowired
    private ProtectService protectService;

    //获取云防护列表
    @ResponseBody
    @RequestMapping("/getFirewallList.json")
    public Map<String,Object> getProtectList(){
        Map<String,Object> map1 = new HashMap<String,Object>();
        List<ProtectDTO> list = protectService.getProtectList();
        map1.put("result","true");
        map1.put("errortype",0);
        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("info",list);
        map1.put("param",map2);
        map1.put("errormsg","");
        return map1;
    }

    //创建云防护
    @ResponseBody
    @RequestMapping("/createCloudProtect.json")
    public Map<String,Object> addProtect(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        String name = request.getParameter("name");
        YunProtect yunProtect = new YunProtect();
        yunProtect.setProtectname(name);
        yunProtect.setCreatetime(new Date());
        int i = protectService.addProtect(yunProtect);
        if (i>0){
            map.put("result","true");
            map.put("errortype",0);
            map.put("errormsg","");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype",-1);
            map.put("errormsg","添加失败");
            map.put("param","");
        }
        return map;
    }

    //删除云防护
    @ResponseBody
    @RequestMapping("/deleteFire.json")
    public Map<String,Object> deleteProtect(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        String id = request.getParameter("id");
        int i = protectService.deleteProtect(Long.parseLong(id));
        if (i>0){
            map.put("result","true");
            map.put("errortype",0);
            map.put("errormsg","删除成功");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype",-1);
            map.put("errormsg","删除失败");
            map.put("param","");
        }
        return map;
    }

    //修改云防护
    @ResponseBody
    @RequestMapping("/firewallName.json")
    public Map<String,Object> updateProtect(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        YunProtect yunProtect = new YunProtect();
        yunProtect.setProtectid(Long.parseLong(id));
        yunProtect.setProtectname(name);
        yunProtect.setCreatetime(new Date());
        int i = protectService.updateProtect(yunProtect);
        if (i>0){
            map.put("result","true");
            map.put("errortype",0);
            map.put("errormsg","");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype",-1);
            map.put("errormsg","修改失败");
            map.put("param","");
        }
        return map;
    }


}
