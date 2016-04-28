package com.wd.control.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wd.entity.User;
import com.wd.service.user.IUserService;

@Controller
public class UserController {
	public UserController() {
		System.out.println("加载!");
	}
	@Autowired 
	private IUserService userService;
	public void setUserService(IUserService userService) {
		System.out.println("装载userService");
		this.userService = userService;
	}
	/**
	 * 注册
	 * @return
	 */
	@RequestMapping("/register")
	public String addUserController(User user) {
		System.out.println(user);
		userService.addUserService(user);
		return "login";
	}
	
	/**
	 * 登录
	 * @param user
	 * @return
	 */
	@RequestMapping("/login")
	public String loginUserController(User user) {
		System.out.println(user);
		return userService.loginService(user) == true ? "listitems" : "login";
	}
}
