package app.domain.model;
 
import java.sql.Date;
import java.time.LocalDate;


public class DiagnosticAidOrder extends Order {
	private int itemNumber;
    private String diagnosticAidId;
    private String diagnosticAidName;
    private int quantity;
    private boolean requiresSpecialist;
    private double cost;

    public DiagnosticAidOrder(String orderNumber, Patient patient, User doctor, LocalDate creationDate) {
        super(orderNumber, patient, doctor, java.sql.Date.valueOf(creationDate), "DIAGNOSTIC_AID");
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDiagnosticAidId() {
        return diagnosticAidId;
    }

    public void setDiagnosticAidId(String diagnosticAidId) {
        this.diagnosticAidId = diagnosticAidId;
    }

    public String getDiagnosticAidName() {
        return diagnosticAidName;
    }

    public void setDiagnosticAidName(String diagnosticAidName) {
        this.diagnosticAidName = diagnosticAidName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isRequiresSpecialist() {
        return requiresSpecialist;
    }

    public void setRequiresSpecialist(boolean requiresSpecialist) {
        this.requiresSpecialist = requiresSpecialist;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
