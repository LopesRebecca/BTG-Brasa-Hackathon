package com.example.btgbrasahackathon.entity.account;

public class OverDraftDTO {
    private String accountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private int overdraftContractedLimit;
    private String overdraftContractedLimitCurrency;
    private int overdraftUsedLimit;
    private String overdraftUsedLimitCurrency;
    private int unarrangedOverdraftAmount;
    private String unarrangedOverdraftAmountCurrency;
    
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
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public int getOverdraftContractedLimit() {
		return overdraftContractedLimit;
	}
	public void setOverdraftContractedLimit(int overdraftContractedLimit) {
		this.overdraftContractedLimit = overdraftContractedLimit;
	}
	public String getOverdraftContractedLimitCurrency() {
		return overdraftContractedLimitCurrency;
	}
	public void setOverdraftContractedLimitCurrency(String overdraftContractedLimitCurrency) {
		this.overdraftContractedLimitCurrency = overdraftContractedLimitCurrency;
	}
	public int getOverdraftUsedLimit() {
		return overdraftUsedLimit;
	}
	public void setOverdraftUsedLimit(int overdraftUsedLimit) {
		this.overdraftUsedLimit = overdraftUsedLimit;
	}
	public String getOverdraftUsedLimitCurrency() {
		return overdraftUsedLimitCurrency;
	}
	public void setOverdraftUsedLimitCurrency(String overdraftUsedLimitCurrency) {
		this.overdraftUsedLimitCurrency = overdraftUsedLimitCurrency;
	}
	public int getUnarrangedOverdraftAmount() {
		return unarrangedOverdraftAmount;
	}
	public void setUnarrangedOverdraftAmount(int unarrangedOverdraftAmount) {
		this.unarrangedOverdraftAmount = unarrangedOverdraftAmount;
	}
	public String getUnarrangedOverdraftAmountCurrency() {
		return unarrangedOverdraftAmountCurrency;
	}
	public void setUnarrangedOverdraftAmountCurrency(String unarrangedOverdraftAmountCurrency) {
		this.unarrangedOverdraftAmountCurrency = unarrangedOverdraftAmountCurrency;
	}
}
