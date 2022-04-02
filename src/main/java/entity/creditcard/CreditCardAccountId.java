package entity.creditcard;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class CreditCardAccountId {
    public String creditCardAccountId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String name;
    public String productType;
    public String creditCardNetwork;
    public ArrayList<PaymentMethod> paymentMethod;
}