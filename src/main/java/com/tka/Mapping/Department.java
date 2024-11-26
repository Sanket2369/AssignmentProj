package com.tka.Mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptid;
	String dname;
	String loc;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptid")
	List<Employee> empList;

	public Department(String dname, String loc) {
		super();
		this.dname = dname;
		this.loc = loc;
	}

	public Department(String dname, List<Employee> empList) {
		super();
		this.dname = dname;
		empList = empList;
	}



	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		empList = empList;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

}