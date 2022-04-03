package com.example.btgbrasahackathon.entity.account;

import com.example.btgbrasahackathon.entity.DataObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Balances extends DataObject{
    public String accountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public double availableAmount;
    public String availableAmountCurrency;
    public int blockedAmount;
    public String blockedAmountCurrency;
    public int automaticallyInvestedAmount;
    public String automaticallyInvestedAmountCurrency;
}
