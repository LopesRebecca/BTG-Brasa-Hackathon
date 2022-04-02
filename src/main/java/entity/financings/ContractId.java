package entity.financings;

import java.util.ArrayList;

public class ContractId {
        public String contractId;
        public String contractNumber;
        public String customerId;
        public String organizationId;
        public String organizationName;
        public String ipocCode;
        public String productName;
        public String productType;
        public String contractDate;
        public String settlementDate;
        public double contractAmount;
        public String currency;
        public String dueDate;
        public String instalmentPeriodicity;
        public String instalmentPeriodicityAdditionalInfo;
        public String firstInstalmentDueDate;
        public double CET;
        public String amortizationScheduled;
        public String amortizationScheduledAdditionalInfo;
        public ArrayList<InterestRate> interestRates;
        public ArrayList<ContractedFee> contractedFees;
        public ArrayList<ContractedFinanceCharge> contractedFinanceCharges;
}
