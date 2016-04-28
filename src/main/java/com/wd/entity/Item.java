package com.wd.entity;

import java.util.Date;

public class Item {

	private int i_id;
	private String i_name;
	private String i_img1;
	private String i_img2;
	private String i_img3;
	private double i_price;
	private int i_stock;
	private int i_sales;
	private double i_postage;
	private String i_content;
	private int i_iskill;
	private Date i_killtime;
	private Date i_time;
	private int u_id;
	
	public int getI_id() {
		return i_id;
	}
	public void setI_id(int i_id) {
		this.i_id = i_id;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public String getI_img1() {
		return i_img1;
	}
	public void setI_img1(String i_img1) {
		this.i_img1 = i_img1;
	}
	public String getI_img2() {
		return i_img2;
	}
	public void setI_img2(String i_img2) {
		this.i_img2 = i_img2;
	}
	public String getI_img3() {
		return i_img3;
	}
	public void setI_img3(String i_img3) {
		this.i_img3 = i_img3;
	}
	public double getI_price() {
		return i_price;
	}
	public void setI_price(double i_price) {
		this.i_price = i_price;
	}
	public int getI_stock() {
		return i_stock;
	}
	public void setI_stock(int i_stock) {
		this.i_stock = i_stock;
	}
	public int getI_sales() {
		return i_sales;
	}
	public void setI_sales(int i_sales) {
		this.i_sales = i_sales;
	}
	public double getI_postage() {
		return i_postage;
	}
	public void setI_postage(double i_postage) {
		this.i_postage = i_postage;
	}
	public String getI_content() {
		return i_content;
	}
	public void setI_content(String i_content) {
		this.i_content = i_content;
	}
	public int getI_iskill() {
		return i_iskill;
	}
	public void setI_iskill(int i_iskill) {
		this.i_iskill = i_iskill;
	}
	public Date getI_killtime() {
		return i_killtime;
	}
	public void setI_killtime(Date i_killtime) {
		this.i_killtime = i_killtime;
	}
	public Date getI_time() {
		return i_time;
	}
	public void setI_time(Date i_time) {
		this.i_time = i_time;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "Item [i_id=" + i_id + ", i_name=" + i_name + ", i_img1=" + i_img1 + ", i_img2=" + i_img2 + ", i_img3="
				+ i_img3 + ", i_price=" + i_price + ", i_stock=" + i_stock + ", i_sales=" + i_sales + ", i_postage="
				+ i_postage + ", i_content=" + i_content + ", i_iskill=" + i_iskill + ", i_killtime=" + i_killtime
				+ ", i_time=" + i_time + ", u_id=" + u_id + "]";
	}
	public Item(int i_id, String i_name, String i_img1, String i_img2, String i_img3, double i_price, int i_stock,
			int i_sales, double i_postage, String i_content, int i_iskill, Date i_killtime, Date i_time, int u_id) {
		super();
		this.i_id = i_id;
		this.i_name = i_name;
		this.i_img1 = i_img1;
		this.i_img2 = i_img2;
		this.i_img3 = i_img3;
		this.i_price = i_price;
		this.i_stock = i_stock;
		this.i_sales = i_sales;
		this.i_postage = i_postage;
		this.i_content = i_content;
		this.i_iskill = i_iskill;
		this.i_killtime = i_killtime;
		this.i_time = i_time;
		this.u_id = u_id;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
