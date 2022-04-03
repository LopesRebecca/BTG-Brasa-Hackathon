package com.example.btgbrasahackathon.entity.account;

import com.example.btgbrasahackathon.entity.DataObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Details extends DataObject{
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
