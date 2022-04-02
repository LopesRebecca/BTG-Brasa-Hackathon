package entity.creditcard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBill {
    public String creditCardAccountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String billId;
    public String dueDate;
    public double billTotalAmount;
    public String billTotalAmountCurrency;
    public double billMinimumAmount;
    public String billMinimumAmountCurrency;
    public boolean isInstalment;
    public Object financeCharges;
    public Object payments;
}
