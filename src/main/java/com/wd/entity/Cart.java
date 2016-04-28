package com.wd.entity;

import java.util.Date;
import java.util.List;

public class Cart {
	
	private int c_id;
	private int u_id;
	private int i_id;
	private int c_count;
	private Date c_time;
	private List<Item> items;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public int getC_count() {
		return c_count;
	}
	public void setC_count(int c_count) {
		this.c_count = c_count;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Date getC_time() {
		return c_time;
	}
	public void setC_time(Date c_time) {
		this.c_time = c_time;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int c_id, int u_id, int i_id, int c_count, Date c_time, List<Item> items) {
		super();
		this.c_id = c_id;
		this.u_id = u_id;
		this.i_id = i_id;
		this.c_count = c_count;
		this.c_time = c_time;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Cart [c_id=" + c_id + ", u_id=" + u_id + ", i_id=" + i_id + ", c_count=" + c_count + ", c_time="
				+ c_time + ", items=" + items + "]";
	}

}
