package com.qf.action;

import com.qf.dto.TaskDTO;
import com.qf.util.DataUtils;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.zip.ZipInputStream;

/**
 * Thanks for Everything.
 */
@Controller
public class ActivitAction {

	//自动注入activiti的服务对象
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;

	@RequestMapping("/activiti/deploy.json")
	public String deployGd(@RequestParam("profile") CommonsMultipartFile profile, String name) throws IOException {
		//1得到文件上传的内容
		InputStream inputStream = profile.getInputStream();//得到文件上传的输入流

		//2部署为zip方式发布
		ZipInputStream zipInputStream = new ZipInputStream(inputStream);
		//得到部署的service
		Deployment deploy = repositoryService.createDeployment()
				.addZipInputStream(zipInputStream)
				.name(name)
				.deploy();

		//3启动流程
		//根据key(唯一ID标示)来启动流程实例 这个name就是流程图的唯一ID标示，也就是KEY
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(name);

		//返回到这个模块的列表
		return "redirect:/#/cdn";
	}


	@RequestMapping("/activiti/task.json")
	public ModelAndView taskQuery(HttpServletRequest request){
		//从session中得到用户
		//根据用户查询，这个用户对应的任务有哪些
		ModelAndView mv = new ModelAndView();
		//查询
		List<Task> list = taskService.createTaskQuery()
//				.taskAssignee("攻城狮")//按照指定人的名称查询
				.list();
		List<TaskDTO> taskList = new ArrayList<TaskDTO>();
		for (Task task : list) {
			TaskDTO dto = new TaskDTO();
			dto.setTaskId(task.getId());
			dto.setTaskName(task.getName());
			dto.setCtime(DataUtils.dateToStr(task.getCreateTime()));
			taskList.add(dto);
		}
		mv.addObject("taskList",taskList);
		mv.setViewName("/view/cdn/cdn.jsp");//物理视图
		return mv;
	}

	@RequestMapping("/activiti/completeTask.json")
	public String completeTask(HttpServletRequest request){
		String taskId = request.getParameter("taskId");
		taskService.complete(taskId);
		return "redirect:/#/cdn";
	}
	
}
