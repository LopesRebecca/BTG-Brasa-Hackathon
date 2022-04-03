package com.example.btgbrasahackathon.entity.creditcard;

public class PaymentMethod {
    private String identificationNumber;
    private boolean isMultipleCreditCard;
    
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public boolean isMultipleCreditCard() {
		return isMultipleCreditCard;
	}
	public void setMultipleCreditCard(boolean isMultipleCreditCard) {
		this.isMultipleCreditCard = isMultipleCreditCard;
	}
}
