package entity.customers;

import java.util.ArrayList;

public class Customers {
    public String customerId;
    public String organizationId;
    public ArrayList<String> productsServicesType;
    public String productsServicesTypeAdditionalInfo;
    public ArrayList<Account> accounts;
    public String brandName;
    public String companyCnpj;
    public String occupationCode;
    public String occupationDescription;
    public InformedIncome informedIncome;
    public InformedPatrimony informedPatrimony;
}
