package entity.financings;

import java.util.ArrayList;

public class ContractsPayments {
    public String contractId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public int paidInstalments;
    public double contractOutstandingBalance;
    public ArrayList<Release> releases;
}