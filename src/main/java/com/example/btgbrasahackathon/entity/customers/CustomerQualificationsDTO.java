package com.example.btgbrasahackathon.entity.customers;

public class CustomerQualificationsDTO{
	private String customerId;
	private String organizationId;
	private String brandName;
	private String companyCnpj;
	private String occupationCode;
	private String occupationDescription;
	private InformedIncome informedIncome;
	private InformedPatrimony informedPatrimony;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getCompanyCnpj() {
		return companyCnpj;
	}
	public void setCompanyCnpj(String companyCnpj) {
		this.companyCnpj = companyCnpj;
	}
	public String getOccupationCode() {
		return occupationCode;
	}
	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}
	public InformedPatrimony getInformedPatrimony() {
		return informedPatrimony;
	}
	public void setInformedPatrimony(InformedPatrimony informedPatrimony) {
		this.informedPatrimony = informedPatrimony;
	}
	public String getOccupationDescription() {
		return occupationDescription;
	}
	public void setOccupationDescription(String occupationDescription) {
		this.occupationDescription = occupationDescription;
	}
	public InformedIncome getInformedIncome() {
		return informedIncome;
	}
	public void setInformedIncome(InformedIncome informedIncome) {
		this.informedIncome = informedIncome;
	}
}
