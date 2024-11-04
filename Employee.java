package com.example.demo.model;


public class Employee {
	private Integer empId;
	private String empName;
	private Integer empSalary;
	
	public Employee(String productId, String productName, Integer productPrice) {
		super();
		this.empId =empId;
		this.empName =empName;
		this.empSalary =empSalary;
		
	}
	public Employee() {
		super();
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
}
