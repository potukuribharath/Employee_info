package com.employee.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employe_details")
public class Employee {
	
	@Id
	private int empid;
	private String empname;
	private long empcompensation;
	private String performance;
	private String feedback;
	private String personal_details;
	private long emp_mobile;
	private int org_id;
	private String time;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, long empcompensation, String performance, String feedback,
			String personal_details, long emp_mobile, int org_id, String time) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empcompensation = empcompensation;
		this.performance = performance;
		this.feedback = feedback;
		this.personal_details = personal_details;
		this.emp_mobile = emp_mobile;
		this.org_id = org_id;
		this.time = time;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getEmpcompensation() {
		return empcompensation;
	}
	public void setEmpcompensation(long empcompensation) {
		this.empcompensation = empcompensation;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getPersonal_details() {
		return personal_details;
	}
	public void setPersonal_details(String personal_details) {
		this.personal_details = personal_details;
	}
	public long getEmp_mobile() {
		return emp_mobile;
	}
	public void setEmp_mobile(long emp_mobile) {
		this.emp_mobile = emp_mobile;
	}
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
		this.org_id = org_id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
