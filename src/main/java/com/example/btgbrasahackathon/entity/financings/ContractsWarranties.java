package com.example.btgbrasahackathon.entity.financings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractsWarranties {
    public String contractId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String currency;
    public String warrantyType;
    public String warrantySubType;
    public double warrantyAmount;
}
