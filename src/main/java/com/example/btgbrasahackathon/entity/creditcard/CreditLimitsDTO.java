package com.example.btgbrasahackathon.entity.creditcard;

public class CreditLimitsDTO {
	
    private String creditCardAccountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private String creditLineLimitType;
    private String consolidationType;
    private String identificationNumber;
    private boolean isLimitFlexible;
    private String limitAmountCurrency;
    private double limitAmount;
    private String usedAmountCurrency;
    private double usedAmount;
    private String availableAmountCurrency;
    private double availableAmount;
	
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
	public String getCreditLineLimitType() {
		return creditLineLimitType;
	}
	public void setCreditLineLimitType(String creditLineLimitType) {
		this.creditLineLimitType = creditLineLimitType;
	}
	public String getConsolidationType() {
		return consolidationType;
	}
	public void setConsolidationType(String consolidationType) {
		this.consolidationType = consolidationType;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public boolean isLimitFlexible() {
		return isLimitFlexible;
	}
	public void setLimitFlexible(boolean isLimitFlexible) {
		this.isLimitFlexible = isLimitFlexible;
	}
	public String getLimitAmountCurrency() {
		return limitAmountCurrency;
	}
	public void setLimitAmountCurrency(String limitAmountCurrency) {
		this.limitAmountCurrency = limitAmountCurrency;
	}
	public double getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(double limitAmount) {
		this.limitAmount = limitAmount;
	}
	public String getUsedAmountCurrency() {
		return usedAmountCurrency;
	}
	public void setUsedAmountCurrency(String usedAmountCurrency) {
		this.usedAmountCurrency = usedAmountCurrency;
	}
	public double getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(double usedAmount) {
		this.usedAmount = usedAmount;
	}
	public String getAvailableAmountCurrency() {
		return availableAmountCurrency;
	}
	public void setAvailableAmountCurrency(String availableAmountCurrency) {
		this.availableAmountCurrency = availableAmountCurrency;
	}
	public double getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(double availableAmount) {
		this.availableAmount = availableAmount;
	}
}
