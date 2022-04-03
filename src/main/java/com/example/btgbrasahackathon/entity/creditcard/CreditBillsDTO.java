package com.example.btgbrasahackathon.entity.creditcard;

public class CreditBillsDTO {

    private String creditCardAccountId;
    private String customerId;
    private String organizationId;
    private String organizationName;
    private String billId;
    private String dueDate;
    private double billTotalAmount;
    private String billTotalAmountCurrency;
    private double billMinimumAmount;
    private String billMinimumAmountCurrency;
    private boolean isInstalment;
    private Object financeCharges;
    private Object payments;
    
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
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public double getBillTotalAmount() {
		return billTotalAmount;
	}
	public void setBillTotalAmount(double billTotalAmount) {
		this.billTotalAmount = billTotalAmount;
	}
	public String getBillTotalAmountCurrency() {
		return billTotalAmountCurrency;
	}
	public void setBillTotalAmountCurrency(String billTotalAmountCurrency) {
		this.billTotalAmountCurrency = billTotalAmountCurrency;
	}
	public double getBillMinimumAmount() {
		return billMinimumAmount;
	}
	public void setBillMinimumAmount(double billMinimumAmount) {
		this.billMinimumAmount = billMinimumAmount;
	}
	public String getBillMinimumAmountCurrency() {
		return billMinimumAmountCurrency;
	}
	public void setBillMinimumAmountCurrency(String billMinimumAmountCurrency) {
		this.billMinimumAmountCurrency = billMinimumAmountCurrency;
	}
	public boolean isInstalment() {
		return isInstalment;
	}
	public void setInstalment(boolean isInstalment) {
		this.isInstalment = isInstalment;
	}
	public Object getPayments() {
		return payments;
	}
	public void setPayments(Object payments) {
		this.payments = payments;
	}
	public Object getFinanceCharges() {
		return financeCharges;
	}
	public void setFinanceCharges(Object financeCharges) {
		this.financeCharges = financeCharges;
	}
}	
