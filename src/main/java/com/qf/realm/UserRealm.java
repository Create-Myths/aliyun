package com.qf.realm;

import com.qf.pojo.UUser;
import com.qf.service.YunUserService;
import com.qf.util.PasswordUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Thanks for Everything.
 */
public class UserRealm extends AuthorizingRealm {

	@Autowired
	private YunUserService yunUserService;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		String username = usernamePasswordToken.getUsername();
		String password = new String(usernamePasswordToken.getPassword());
//		password = PasswordUtil.md5(password,username);//需要在spring的配置文件指定为md5加密和散列次数
		//根据用户名和密码从DB中取记录。
		UUser login = yunUserService.login(username, password);
		SimpleAuthenticationInfo info = null;
		if(login!=null){
			String realName = getName();
			ByteSource byteSource = ByteSource.Util.bytes(username);
			info = new SimpleAuthenticationInfo(username,password,byteSource,realName);
		}
		return info;
	}


	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Object principal = principals.getPrimaryPrincipal();
		//根据用户名从DB中找对应的权限
		//角色授权
		Set<String> roles = new HashSet<String>();
		if("admin".equals(principal)){
			roles.add("admin");
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(roles);
		return info;
	}


}
