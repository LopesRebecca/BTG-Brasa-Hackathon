package com.example.btgbrasahackathon.entity.creditcard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardAccount {
    public String creditCardAccountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String name;
    public String productType;
    public String creditCardNetwork;
}
