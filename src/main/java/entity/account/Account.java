package entity.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    public String creditCardAccountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String creditLineLimitType;
    public String consolidationType;
    public String identificationNumber;
    public boolean isLimitFlexible;
    public String limitAmountCurrency;
    public double limitAmount;
    public String usedAmountCurrency;
    public double usedAmount;
    public String availableAmountCurrency;
    public double availableAmount;
}
