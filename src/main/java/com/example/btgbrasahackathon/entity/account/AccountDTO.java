package com.example.btgbrasahackathon.entity.account;

public class AccountDTO{
	
    private String creditCardAccountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private String name;
    private String productType;
    private String creditCardNetwork;
    
	public String getCreditCardAccountId() {
		return creditCardAccountId;
	}
	public void setCreditCardAccountId(String creditCardAccountId) {
		this.creditCardAccountId = creditCardAccountId;
	}
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
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getCreditCardNetwork() {
		return creditCardNetwork;
	}
	public void setCreditCardNetwork(String creditCardNetwork) {
		this.creditCardNetwork = creditCardNetwork;
	}
}
