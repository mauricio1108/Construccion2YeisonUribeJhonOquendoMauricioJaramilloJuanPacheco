package app.domain.model;
 
public class DiagnosticAidOrder extends Order {
    private int itemNumber;
    private String diagnosticAidId;
    private String diagnosticAidName;
    private int quantity;
    private boolean requiresSpecialist;
    private User doctor;
    private double cost;
 
    
    public int getItemNumber() { return itemNumber; }
    public void setItemNumber(int itemNumber) { this.itemNumber = itemNumber; }
    public String getDiagnosticAidId() { return diagnosticAidId; }
    public void setDiagnosticAidId(String diagnosticAidId) { this.diagnosticAidId = diagnosticAidId; }
    public String getDiagnosticAidName() { return diagnosticAidName; }
    public void setDiagnosticAidName(String diagnosticAidName) { this.diagnosticAidName = diagnosticAidName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public boolean isRequiresSpecialist() { return requiresSpecialist; }
    public void setRequiresSpecialist(boolean requiresSpecialist) { this.requiresSpecialist = requiresSpecialist; }
    public User getDoctor() {
        return doctor;
    }
    public void setDoctor(User doctor) {
        this.doctor = doctor;
    } 
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public DiagnosticAidOrder findById(DiagnosticAidOrder order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}