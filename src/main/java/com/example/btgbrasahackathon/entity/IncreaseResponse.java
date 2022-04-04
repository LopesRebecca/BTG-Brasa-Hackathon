package com.example.btgbrasahackathon.entity;

import java.util.Date;

public class IncreaseResponse {
    private String customerId;
    private Double newLimit;
    private Double oldLimit;
    private Date dateRequest;
    private String message;

    public IncreaseResponse() {
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
