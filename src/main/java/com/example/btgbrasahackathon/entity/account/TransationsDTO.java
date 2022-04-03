package com.example.btgbrasahackathon.entity.account;

 class TransationsDTO {
    private String accountId;
    private String customerId;
    private String organizationId;
	private String organizationName;
    private String transactionId;
    private String completedAuthorisedPaymentType;
    private String creditDebitType;
    private String transactionName;
    private String type;
    private double amount;
    private String transactionCurrency;
    private String transactionDate;
    private String partieCnpjCpf;
    private String partiePersonType;
    private String partieCompeCode;
    private String partieBranchCode;
    private String partieNumber;
    private String partieCheckDigit;
    
    public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	public String getCompletedAuthorisedPaymentType() {
		return completedAuthorisedPaymentType;
	}
	public void setCompletedAuthorisedPaymentType(String completedAuthorisedPaymentType) {
		this.completedAuthorisedPaymentType = completedAuthorisedPaymentType;
	}
	public String getCreditDebitType() {
		return creditDebitType;
	}
	public void setCreditDebitType(String creditDebitType) {
		this.creditDebitType = creditDebitType;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionCurrency() {
		return transactionCurrency;
	}
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getPartieCnpjCpf() {
		return partieCnpjCpf;
	}
	public void setPartieCnpjCpf(String partieCnpjCpf) {
		this.partieCnpjCpf = partieCnpjCpf;
	}
	public String getPartiePersonType() {
		return partiePersonType;
	}
	public void setPartiePersonType(String partiePersonType) {
		this.partiePersonType = partiePersonType;
	}
	public String getPartieCompeCode() {
		return partieCompeCode;
	}
	public void setPartieCompeCode(String partieCompeCode) {
		this.partieCompeCode = partieCompeCode;
	}
	public String getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPartieCheckDigit() {
		return partieCheckDigit;
	}
	public void setPartieCheckDigit(String partieCheckDigit) {
		this.partieCheckDigit = partieCheckDigit;
	}
	public String getPartieNumber() {
		return partieNumber;
	}
	public void setPartieNumber(String partieNumber) {
		this.partieNumber = partieNumber;
	}
	public String getPartieBranchCode() {
		return partieBranchCode;
	}
	public void setPartieBranchCode(String partieBranchCode) {
		this.partieBranchCode = partieBranchCode;
	}
}
