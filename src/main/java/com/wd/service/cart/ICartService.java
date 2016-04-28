package com.wd.service.cart;

import java.util.List;

import com.wd.entity.Cart;
/**
 * 购物车Service		
 * @author zhengbinMac
 *
 */
public interface ICartService {
	
	/**
	 * 增加购物车条目
	 * @param cart
	 * @return boolean
	 */
	public boolean addCart(Cart cart);
	
	/**
	 * 根据用户id获得该用户购物车的所有条目
	 * @return ArrayList
	 */
	public List<Cart> listCart(int u_id);
	
}
