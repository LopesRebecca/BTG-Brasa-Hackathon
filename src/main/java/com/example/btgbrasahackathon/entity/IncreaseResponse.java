package com.example.btgbrasahackathon.entity;

import java.util.Date;

public class IncreaseResponse {
    private String customerId;
    private Double newLimit;
    private Double oldLimit;
    private Date dateRequest;
    private Double increase;
    private Double availableAmount;
    private Double billTotalAmount;

    public IncreaseResponse() {
    }

    public IncreaseResponse(String customerId, Double newLimit, Double oldLimit,
                            Date dateRequest, Double availableAmount, Double billTotalAmount) {
        this.customerId = customerId;
        this.newLimit = newLimit;
        this.oldLimit = oldLimit;
        this.dateRequest = dateRequest;
        this.increase = newLimit - oldLimit;
        this.availableAmount = availableAmount;
        this.billTotalAmount = billTotalAmount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Double getNewLimit() {
        return newLimit;
    }

    public void setNewLimit(Double newLimit) {
        this.newLimit = newLimit;
    }

    public Double getOldLimit() {
        return oldLimit;
    }

    public void setOldLimit(Double oldLimit) {
        this.oldLimit = oldLimit;
    }

    public Date getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(Date dateRequest) {
        this.dateRequest = dateRequest;
    }

    public Double getIncrease() {
        return increase;
    }

    public void setIncrease(Double increase) {
        this.increase = increase;
    }

    public Double getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(Double availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Double getBillTotalAmount() {
        return billTotalAmount;
    }

    public void setBillTotalAmount(Double billTotalAmount) {
        this.billTotalAmount = billTotalAmount;
    }
}
