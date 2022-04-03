package com.example.btgbrasahackathon.entity.loans;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contracts {
	public String contractId;
    public String contractNumber;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String ipocCode;
    public String productName;
    public String productType;
    public String productSubType;
    public String contractDate;
    public String settlementDate;
    public double contractAmount;
    public String currency;
    public String dueDate;
    public String instalmentPeriodicity;
    public String instalmentPeriodicityAdditionalInfo;
    public String firstInstalmentDueDate;
    @JsonProperty("CET") 
    public double cET;
    public String amortizationScheduled;
    public String amortizationScheduledAdditionalInfo;
    public String cnpjConsignee;
    public ArrayList<InterestRate> interestRates;
    public ArrayList<ContractedFee> contractedFees;
    public ArrayList<ContractedFinanceCharge> contractedFinanceCharges;
    
	public class InterestRate{
	    public String taxType;
	    public String interestRateType;
	    public String taxPeriodicity;
	    public String calculation;
	    public String referentialRateIndexerType;
	    public double preFixedRate;
	    public String postFixedRate;
	    public String additionalInfo;
	}

	public class ContractedFee{
	    public String feeName;
	    public String feeCode;
	    public String feeChargeType;
	    public String feeCharge;
	    public double feeAmount;
	    public double feeRate;
	}

	public class ContractedFinanceCharge{
	    public String chargeType;
	    public String chargeAdditionalInfo;
	    public double chargeRate;
	}
}
