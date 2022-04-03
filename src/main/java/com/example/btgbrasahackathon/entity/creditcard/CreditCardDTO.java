package com.example.btgbrasahackathon.entity.creditcard;

import java.util.ArrayList;

public class CreditCardDTO {
	private String creditCardAccountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private String name;
    private String productType;
    private String creditCardNetwork;
    private ArrayList<PaymentMethod> paymentMethod;
    
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
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public ArrayList<PaymentMethod> getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(ArrayList<PaymentMethod> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getCreditCardNetwork() {
		return creditCardNetwork;
	}
	public void setCreditCardNetwork(String creditCardNetwork) {
		this.creditCardNetwork = creditCardNetwork;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
