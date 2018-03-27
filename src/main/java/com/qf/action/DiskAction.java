package com.qf.action;

import com.qf.dto.DiskDTO;
import com.qf.pojo.YunDisk;
import com.qf.service.DiskService;
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
public class DiskAction {

    //调用服务层
    @Autowired
    private DiskService diskService;


    //获取云硬盘列表
    @ResponseBody
    @RequestMapping("/GetDiskList.json")
    public List<DiskDTO> getdisklist(HttpServletRequest request) {
        String diskName = request.getParameter("diskName");
        List<DiskDTO> byName = diskService.findByName(diskName);
        return byName;
    }


    //创建云硬盘
    @RequestMapping("/CreateDisk.json")
    @ResponseBody
    public Map<String, Object> createDisk(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        YunDisk yunDisk = new YunDisk();
        String diskName = request.getParameter("diskName");
        String size = request.getParameter("size");

        yunDisk.setDiskname(diskName);
        yunDisk.setDiskcapacity(size);

        yunDisk.setCreatetime(new Date());
        int i = diskService.addDisk(yunDisk);
        if (i > 0) {//添加成功
            map.put("result", "true");
            map.put("errortype", "0");
            map.put("errormsg", "");
            map.put("param", "");
        } else {
            map.put("result", "false");
            map.put("errortype", "-1");
            map.put("errormsg", "添加失败");
            map.put("param", "");
        }
        return map;
    }


    //挂载云硬盘
    @RequestMapping("/MountDisk.json")
    @ResponseBody
    public Map<String, Object> updatteDisk(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        YunDisk yunDisk = new YunDisk();
        String hostId = request.getParameter("hostId");
        String diskId = request.getParameter("diskId");
        yunDisk.setDid(Long.parseLong(diskId));
        yunDisk.setHid(Long.parseLong(hostId));

        int i = diskService.updateDist(yunDisk);
        if (i > 0) {  //挂载成功
            map.put("result", "true");
            map.put("errortype", "0");
            map.put("errormsg", "");
            map.put("param", "");
        } else {
            map.put("result", "false");
            map.put("errortype", "-1");
            map.put("errormsg", "");
            map.put("param", "");
        }
        return map;

    }

    //删除云硬盘
    @RequestMapping("/DeleteDisk.json")
    @ResponseBody
    public Map<String, Object> deleteDns(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        String id = request.getParameter("diskId");
        int i = diskService.deleteDist(Long.parseLong(id));
        if (i > 0) {   //删除成功
            map.put("result", "true");
            map.put("errortype", "0");
            map.put("errormsg", "删除成功");
            map.put("param", "");
        } else {
            map.put("result", "false");
            map.put("errortype", "-1");
            map.put("errormsg", "删除失败");
            map.put("param", "");
        }
        return map;
    }

}
