//package com.wd.control.item;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.wd.entity.Item;
//import com.wd.service.items.IItemService;
//
//@Controller
//public class ItemController {
//	@Autowired
//	private IItemService itemService;
//	public void setItemService(IItemService itemService) {
//		this.itemService = itemService;
//	}
//	
//	/**
//	 * 发布商品
//	 * @param item
//	 * @return
//	 */
//	@RequestMapping("/addItem")
//	public String addItem(Item item) {
//		itemService.addItemService(item);
//		return "";
//	}
//	
//	/**
//	 * 删除商品
//	 * @param i_id
//	 * @return
//	 */
//	@RequestMapping("deleteItem")
//	public String deleteItem(HttpServletRequest request) {
//		int i_id = Integer.parseInt(request.getParameter("i_id"));
//		itemService.deleteItemService(i_id);
//		return "";
//	}
//	
//	/**
//	 * 根据商品id获得该商品详情
//	 * @param i_id
//	 * @return
//	 */
//	@RequestMapping("/getItem")
//	public String getItem(HttpServletRequest request) {
//		int i_id = Integer.parseInt(request.getParameter("i_id"));
//		itemService.getItemService(i_id);
//		return "";
//	}
//	
//	/**
//	 * 更新商品详情
//	 * @param item
//	 * @return
//	 */
//	@RequestMapping("/updateItem")
//	public String updateItem(Item item) {
//		itemService.editItemService(item);
//		return "";
//	}
//	
//	/**
//	 * 获得商品列表
//	 * @return
//	 */
//	@RequestMapping("/listItem")
//	public String listItem() {
//		itemService.listItemsService();
//		return "";
//	}
//	
//	/**
//	 * 获得卖家店铺的商品列表
//	 * @param u_id
//	 * @return
//	 */
//	@RequestMapping("/listStoreItem")
//	public String listStoreItem(HttpServletRequest request) {
//		int u_id = Integer.parseInt(request.getParameter("u_id"));
//		itemService.listStoreItemsService(u_id);
//		return "";
//	}
//	
//}
