package entity.creditcard;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentMethod {
    public String identificationNumber;
    public boolean isMultipleCreditCard;
}
