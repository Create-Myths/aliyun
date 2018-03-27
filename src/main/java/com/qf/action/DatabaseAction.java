package com.qf.action;

import com.qf.dto.DatabaseDTO;
import com.qf.pojo.YunDatabase;
import com.qf.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DatabaseAction {

    @Autowired
    private DatabaseService databaseService;

    //获取DB列表
    @RequestMapping("/getdblist.json")
    @ResponseBody
    public Map<String,Object> getDatabaseList(){
        Map<String,Object> map1 = new HashMap<String,Object>();
        List<DatabaseDTO> list = databaseService.getDatabaseList();
        map1.put("result","true");
        map1.put("errortype","0");
        Map<String,Object> map2 = new HashMap<String,Object>();
        map1.put("param",map2);
        map1.put("errormsg","");
        map2.put("dbs",list);
        return map1;
    }

    //创建DB
    @RequestMapping("/CreateDB.json")
    @ResponseBody
    public Map<String,Object> addDatabase(HttpServletRequest request){
        Map<String, Object> map = new HashMap<String, Object>();
        YunDatabase yunDatabase = new YunDatabase();
        String db_name = request.getParameter("db_name");
        String db_type = request.getParameter("db_type");
        String pay_type = request.getParameter("pay_type");
        String disk = request.getParameter("disk");
        String port = request.getParameter("port");
        String maturity_month = request.getParameter("maturity_month");
        yunDatabase.setDbname(db_name);
        yunDatabase.setDbtypeid(Long.parseLong(db_type));
        yunDatabase.setBuytype(Integer.parseInt(pay_type));
        yunDatabase.setDbdisksize(disk);
        int i = databaseService.addDatabase(yunDatabase);

        if (i>0) {  //添加成功
            map.put("result","true");
            map.put("errortype","0");
            map.put("errormsg","添加成功");
            map.put("param","");
        }else {
            map.put("result","false");
            map.put("errortype","-1");
            map.put("errormsg","");
            map.put("param","");
        }
        return map;
    }

    //删除DB
    @RequestMapping("/DeleteDb.json")
    @ResponseBody
    public Map<String,Object> deleteDatabase(HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        String db_id = request.getParameter("db_id");
        int i = databaseService.deleteDatabase(Long.parseLong(db_id));
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
