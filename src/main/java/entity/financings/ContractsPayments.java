package entity.financings;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ContractsPayments {
    public String contractId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public int paidInstalments;
    public double contractOutstandingBalance;
    public ArrayList<Release> releases;
}