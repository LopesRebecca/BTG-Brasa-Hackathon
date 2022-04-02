package entity.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Balances {
    public String accountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public double availableAmount;
    public String availableAmountCurrency;
    public int blockedAmount;
    public String blockedAmountCurrency;
    public int automaticallyInvestedAmount;
    public String automaticallyInvestedAmountCurrency;
}
