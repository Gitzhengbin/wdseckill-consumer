package com.wd.dao.orders;

import java.util.List;

import com.wd.entity.Orders;
/**
 * 订单Dao
 * @author zhengbinMac
 *
 */
public interface IOrderDao {
	
	/**
	 * 增加订单条目
	 * @param orders
	 * @return boolean
	 */
	public boolean addOrders(Orders orders);
	
	/**
	 * 根据用户id获得该用户所有订单条目
	 * @param u_id
	 * @return ArrayList
	 */
	public List<Orders> listOrders(int u_id);
	
}
