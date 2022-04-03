package com.example.btgbrasahackathon.entity.creditcard;

public class CreditTransationsDTO {
    private String creditCardAccountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private String transactionId;
    private String identificationNumber;
    private String transactionName;
    private String creditDebitType;
    private String transactionType;
    private String paymentType;
    private String feeType;
    private Object chargeIdentificator;
    private Object chargeNumber;
    private double brazilianAmount;
    private double amount;
    private String currency;
    private String transactionDate;
    private String billPostDate;
    private String payeeMCC;
    
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
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	public String getCreditDebitType() {
		return creditDebitType;
	}
	public void setCreditDebitType(String creditDebitType) {
		this.creditDebitType = creditDebitType;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public Object getChargeIdentificator() {
		return chargeIdentificator;
	}
	public void setChargeIdentificator(Object chargeIdentificator) {
		this.chargeIdentificator = chargeIdentificator;
	}
	public Object getChargeNumber() {
		return chargeNumber;
	}
	public void setChargeNumber(Object chargeNumber) {
		this.chargeNumber = chargeNumber;
	}
	public double getBrazilianAmount() {
		return brazilianAmount;
	}
	public void setBrazilianAmount(double brazilianAmount) {
		this.brazilianAmount = brazilianAmount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getBillPostDate() {
		return billPostDate;
	}
	public void setBillPostDate(String billPostDate) {
		this.billPostDate = billPostDate;
	}
	public String getPayeeMCC() {
		return payeeMCC;
	}
	public void setPayeeMCC(String payeeMCC) {
		this.payeeMCC = payeeMCC;
	}
}
