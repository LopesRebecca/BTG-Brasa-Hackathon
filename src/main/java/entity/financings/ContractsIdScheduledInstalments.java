package entity.financings;

import java.util.ArrayList;

public class ContractsIdScheduledInstalments {
    public String contractId;
    public String customerId;
    public String organizationId;
    public String organizationName;
    public String typeNumberOfInstalments;
    public int totalNumberOfInstalments;
    public String typeContractRemaining;
    public int contractRemainingNumber;
    public int paidInstalments;
    public int dueInstalments;
    public int pastDueInstalments;
    public ArrayList<Object> balloonPayments;
}
