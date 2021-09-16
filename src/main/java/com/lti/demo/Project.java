package com.lti.demo;

public class Project {
	private int prdId;
	private String prdName;
	private double prdCost;	
	private String companyName="DMART";
	
	
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdCost() {
		return prdCost;
	}
	public void setPrdCost(double prdCost) {
		this.prdCost = prdCost;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int prdId, String prdName, double prdCost, String companyName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Project [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + ", companyName="
				+ companyName + "]";
	}
}
