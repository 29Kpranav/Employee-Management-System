package com.third.spring3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class manager {

	@Id
	private int id;
	private String branch_name;
	private String name;
	private String salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "manager [id=" + id + ", branch_name=" + branch_name + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
