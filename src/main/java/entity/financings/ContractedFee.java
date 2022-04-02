package entity.financings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContractedFee {
    public String feeName;
    public String feeCode;
    public String feeChargeType;
    public String feeCharge;
    public double feeAmount;
    public double feeRate;
}
