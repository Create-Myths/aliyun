package com.qf.action;

import com.qf.util.ShiroUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thanks for Everything.
 */
@Controller
public class LoginAction {




	@RequestMapping("/doLogin.json")
	public String login(String username,String password){

		//得到Shiro的主题对象
		Subject subject = ShiroUtils.getSubject();
		//对用户信息封装
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		try {
			subject.login(token);
		} catch (AuthenticationException e) {
			System.out.println("认证失败");
			e.printStackTrace();
		}

		return "redirect:index.jsp";
	}

	//登出
	@RequestMapping("/loginout.json")
	public String loginout(){
		ShiroUtils.logout();
		return "redirect:login.html";
	}



}
