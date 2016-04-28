package com.wd.dao.items;

import java.util.List;

import com.wd.entity.Item;
/**
 * 商品Dao
 * @author zhengbinMac
 *
 */
public interface IItemDao {
	/**
	 * 卖家发布商品
	 * @param item
	 * @return
	 */
	public boolean addItem(Item item);
	
	/**
	 * 卖家删除商品
	 * @param i_id
	 * @return
	 */
	public boolean deleteItem(int i_id);
	
	/**
	 * 卖家编辑商品
	 * @param item
	 * @return
	 */
	public boolean editItem(Item item);
	
	/**
	 * 根据商品id获得该商品详情
	 * @param i_id
	 * @return Item
	 */
	public Item getItem(int i_id);
	
	/**
	 * 获得商品列表（按时间倒排）
	 * @return ArrayList
	 */
	public List<Item> listItems();
	
	/**
	 * 根据用户id获得该卖家店铺的商品列表
	 * @param u_id
	 * @return ArrayList
	 */
	public List<Item> listStoreItems(int u_id);
	
	/**
	 * 根据商品id获得该商品销量
	 * @param i_id
	 * @return int
	 */
	public int getSales(int i_id);
	
	/**
	 * 根据商品id获得该商品库存
	 * @param i_id
	 * @return int
	 */
	public int getStock(int i_id);
	
	/**
	 * 根据商品id更新该商品销量
	 * @param i_id
	 * @param sales
	 * @return boolean
	 */
	public boolean editItemSales(int i_id, int sales);
	
	/**
	 * 根据商品id更新该商品库存
	 * @param i_id
	 * @param stock
	 * @return boolean
	 */
	public boolean editItemStock(int i_id, int stock);
	
}
