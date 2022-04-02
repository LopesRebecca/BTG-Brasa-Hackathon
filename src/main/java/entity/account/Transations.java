package entity.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transations {
    public String accountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String transactionId;
    public String completedAuthorisedPaymentType;
    public String creditDebitType;
    public String transactionName;
    public String type;
    public double amount;
    public String transactionCurrency;
    public String transactionDate;
    public String partieCnpjCpf;
    public String partiePersonType;
    public String partieCompeCode;
    public String partieBranchCode;
    public String partieNumber;
    public String partieCheckDigit;
}
