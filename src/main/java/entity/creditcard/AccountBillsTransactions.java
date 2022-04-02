package entity.creditcard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBillsTransactions {
    public String creditCardAccountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String transactionId;
    public String identificationNumber;
    public String transactionName;
    public String creditDebitType;
    public String transactionType;
    public String paymentType;
    public String feeType;
    public Object chargeIdentificator;
    public Object chargeNumber;
    public double brazilianAmount;
    public double amount;
    public String currency;
    public String transactionDate;
    public String billPostDate;
    public Object payeeMCC;
    public String billId;
}
