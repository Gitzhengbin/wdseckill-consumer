package com.wd.service.user;

import com.wd.entity.User;
/**
 * 用户Service
 * @author zhengbinMac
 *
 */
public interface IUserService {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public boolean addUserService(User user);
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public boolean loginService(User user);
	
}
