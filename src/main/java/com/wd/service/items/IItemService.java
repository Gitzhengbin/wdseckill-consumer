package com.wd.service.items;

import java.util.List;

import com.wd.entity.Item;
/**
 * 商品Service
 * @author zhengbinMac
 *
 */
public interface IItemService {
	
	/**
	 * 商铺发布商品
	 * @param item
	 * @return
	 */
	public boolean addItemService(Item item);
	
	/**
	 * 商铺删除商品
	 * @param i_id
	 * @return
	 */
	public boolean deleteItemService(int i_id);
	
	/**
	 * 商铺编辑商品
	 * @param item
	 * @return
	 */
	public boolean editItemService(Item item);
	
	/**
	 * 根据用户id获得商品详情
	 * @param i_id
	 * @return
	 */
	public Item getItemService(int i_id);
	
	/**
	 * 获得商品列表（按时间倒排）
	 * @return
	 */
	public List<Item> listItemsService();
	
	/**
	 * 根据用户id获得该卖家店铺的商品列表
	 * @param u_id
	 * @return
	 */
	public List<Item> listStoreItemsService(int u_id);
	
}
