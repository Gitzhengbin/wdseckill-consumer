package com.wd.entity;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1812346467812806457L;
	
	private int u_id;
	private String u_name;
	private String u_pwd;
	private int u_issell;
	private String u_store;
	private double u_money;
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public int getU_issell() {
		return u_issell;
	}
	public void setU_issell(int u_issell) {
		this.u_issell = u_issell;
	}
	public String getU_store() {
		return u_store;
	}
	public void setU_store(String u_store) {
		this.u_store = u_store;
	}
	public double getU_money() {
		return u_money;
	}
	public void setU_money(double u_money) {
		this.u_money = u_money;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int u_id, String u_name, String u_pwd, int u_issell, String u_store, double u_money) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_issell = u_issell;
		this.u_store = u_store;
		this.u_money = u_money;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_issell=" + u_issell
				+ ", u_store=" + u_store + ", u_money=" + u_money + "]";
	}

}
