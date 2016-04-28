package com.wd.dao.user;

import com.wd.entity.User;
/**
 * 用户Dao
 * @author zhengbinMac
 *
 */
public interface IUserDao {

	/**
	 * 用户注册
	 * @param user
	 * @return boolean
	 */
	public boolean addUser(User user);
	
	/**
	 * 根据用户名判断输入是否正确，用户登录
	 * @param username
	 * @return User
	 */
	public User getUser(String username);

	/**
	 * 根据用户id判断是否卖家
	 * @param u_id
	 * @return boolean
	 */
	public boolean isSell(int u_id);
	
	/**
	 * 根据用户id获得其店铺名
	 * @param u_id
	 * @return String
	 */
	public String getStore(int u_id);
	
	/**
	 * 根据用户id获得其余额
	 * @param u_id
	 * @return double
	 */
	public double getMoney(int u_id);
	
	/**
	 * 根据用户id更新某用户的余额
	 * @param money
	 * @return boolean
	 */
	public boolean updateMoney(int u_id, double money);
	
}
