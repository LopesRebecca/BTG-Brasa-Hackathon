package com.example.btgbrasahackathon.entity.account;

public class BalancesDTO {
    private String accountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private double availableAmount;
    private String availableAmountCurrency;
    private int blockedAmount;
    private String blockedAmountCurrency;
    private int automaticallyInvestedAmount;
    private String automaticallyInvestedAmountCurrency;
    
    
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	public double getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(double availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getAutomaticallyInvestedAmountCurrency() {
		return automaticallyInvestedAmountCurrency;
	}
	public void setAutomaticallyInvestedAmountCurrency(String automaticallyInvestedAmountCurrency) {
		this.automaticallyInvestedAmountCurrency = automaticallyInvestedAmountCurrency;
	}
	public int getBlockedAmount() {
		return blockedAmount;
	}
	public void setBlockedAmount(int blockedAmount) {
		this.blockedAmount = blockedAmount;
	}
	public String getAvailableAmountCurrency() {
		return availableAmountCurrency;
	}
	public void setAvailableAmountCurrency(String availableAmountCurrency) {
		this.availableAmountCurrency = availableAmountCurrency;
	}
	public int getAutomaticallyInvestedAmount() {
		return automaticallyInvestedAmount;
	}
	public void setAutomaticallyInvestedAmount(int automaticallyInvestedAmount) {
		this.automaticallyInvestedAmount = automaticallyInvestedAmount;
	}
	public String getBlockedAmountCurrency() {
		return blockedAmountCurrency;
	}
	public void setBlockedAmountCurrency(String blockedAmountCurrency) {
		this.blockedAmountCurrency = blockedAmountCurrency;
	}
}
