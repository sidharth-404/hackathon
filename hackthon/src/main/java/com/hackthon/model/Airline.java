package com.hackthon.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	private String name;
	private String code;
	private boolean is_lowcost;
	private String logo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isIs_lowcost() {
		return is_lowcost;
	}
	public void setIs_lowcost(boolean is_lowcost) {
		this.is_lowcost = is_lowcost;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	

}
