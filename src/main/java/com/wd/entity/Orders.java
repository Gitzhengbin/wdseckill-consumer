package com.wd.entity;

import java.util.Date;
import java.util.List;

public class Orders {
	
	private int o_id;
	private int u_id;
	private int i_id;
	private int o_count;
	private Date o_time;
	private List<Item> items;
	
	public Orders(int o_id, int u_id, int i_id, int o_count, Date o_time, List<Item> items) {
		super();
		this.o_id = o_id;
		this.u_id = u_id;
		this.i_id = i_id;
		this.o_count = o_count;
		this.o_time = o_time;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Orders [o_id=" + o_id + ", u_id=" + u_id + ", i_id=" + i_id + ", o_count=" + o_count + ", o_time="
				+ o_time + ", items=" + items + "]";
	}
	public int getO_id() {
		return o_id;
	}
	public void setO_id(int o_id) {
		this.o_id = o_id;
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
	public int getO_count() {
		return o_count;
	}
	public void setO_count(int o_count) {
		this.o_count = o_count;
	}
	public Date getO_time() {
		return o_time;
	}
	public void setO_time(Date o_time) {
		this.o_time = o_time;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Orders() {
		super();
	}
	
}
