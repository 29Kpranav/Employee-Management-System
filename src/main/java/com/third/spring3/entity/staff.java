package com.third.spring3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class staff {

	@Id
	private int staffid;
	private String staff_des;
	private String staff_name;
	private String staff_salary;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getStaff_des() {
		return staff_des;
	}
	public void setStaff_des(String staff_des) {
		this.staff_des = staff_des;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getStaff_salary() {
		return staff_salary;
	}
	public void setStaff_salary(String staff_salary) {
		this.staff_salary = staff_salary;
	}
	@Override
	public String toString() {
		return "staff [staffid=" + staffid + ", staff_des=" + staff_des + ", staff_name=" + staff_name
				+ ", staff_salary=" + staff_salary + "]";
	}
	
	
}
