package com.example.btgbrasahackathon.entity.financings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Release {
    public boolean isOverParcelPayment;
    public String paymentId;
    public String instalmentId;
    public String paidDate;
    public String currency;
    public double paidAmount;
    public OverParcel overParcel;
}
