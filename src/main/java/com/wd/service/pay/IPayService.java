package com.wd.service.pay;

public interface IPayService {
	
	/**
	 * 查询账户余额
	 * @param u_id
	 * @return
	 */
	public double getMoneyService(int u_id);
	
	/**
	 * 根据用户id更新该账户余额
	 * @param money
	 * @return
	 */
	public boolean updateMoneyService(int u_id, double money);
	
	/**
	 * 根据商品id获得获得该商品的销量
	 * @param i_id
	 * @return
	 */
	public int getSalesService(int i_id);
	
	/**
	 * 根据商品id获得该商品的库存
	 * @param i_id
	 * @return
	 */
	public int getStockService(int u_id);
	
	/**
	 * 根据商品id更新该商品的销量
	 * @param i_id
	 * @param sales
	 * @return
	 */
	public boolean editItemSalesService(int i_id, int sales);
	
	/**
	 * 根据商品id更新该商品的库存
	 * @param i_id
	 * @param stock
	 * @return
	 */
	public boolean editItemStockService(int i_id, int stock);
	
	/**
	 * 根据购物车id删除该购物车条目
	 * @param c_id
	 * @return
	 */
	public boolean deleteCartService(int c_id);
	
}
