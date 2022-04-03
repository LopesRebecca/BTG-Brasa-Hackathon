package com.example.btgbrasahackathon.entity.financings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Charge {
    public String chargeType;
    public String chargeAdditionalInfo;
    public int chargeAmount;
}
