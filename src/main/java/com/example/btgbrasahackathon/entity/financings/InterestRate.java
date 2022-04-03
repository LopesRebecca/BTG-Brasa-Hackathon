package com.example.btgbrasahackathon.entity.financings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterestRate {
    public String taxType;
    public String interestRateType;
    public String taxPeriodicity;
    public String calculation;
    public String referentialRateIndexerType;
    public String referentialRateIndexerSubType;
    public String referentialRateIndexerAdditionalInfo;
    public double preFixedRate;
    public String postFixedRate;
    public String additionalInfo;
}
