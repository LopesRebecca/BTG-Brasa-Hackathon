package entity.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OverDarf {
    public String accountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public int overdraftContractedLimit;
    public String overdraftContractedLimitCurrency;
    public int overdraftUsedLimit;
    public String overdraftUsedLimitCurrency;
    public int unarrangedOverdraftAmount;
    public String unarrangedOverdraftAmountCurrency;
}
