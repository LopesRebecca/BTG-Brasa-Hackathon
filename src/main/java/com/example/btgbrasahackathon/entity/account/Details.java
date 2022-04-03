package com.example.btgbrasahackathon.entity.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Details{
    public String accountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String compeCode;
    public String branchCode;
    public String number;
    public int checkDigit;
    public String type;
    public String subtype;
    public String currency;
}
