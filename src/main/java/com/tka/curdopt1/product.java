package com.tka.curdopt1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
@Id
	int pid;
	String pname;
	String ptype;
	int pcost;
	
	
	
	public product(int pid, String pname, String ptype, int pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcost = pcost;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	
	
}
