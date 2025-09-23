package app.domain.model;

public class ProcedureOrder {

    private int itemNumber;
    private long procedureId;
    private String procedureName;
    private int quantity;
    private String repetitionFrequency;
    private boolean requiresSpecialist;
    private String specialistId;
    private double cost;

    public ProcedureOrder(int itemNumber, long procedureId, String procedureName, int quantity, String repetitionFrequency, boolean requiresSpecialist, String specialistId, double cost) {
        this.itemNumber = itemNumber;
        this.procedureId = procedureId;
        this.procedureName = procedureName;
        this.quantity = quantity;
        this.repetitionFrequency = repetitionFrequency;
        this.requiresSpecialist = requiresSpecialist;
        this.specialistId = specialistId;
        this.cost = cost;
    }

    // Getters and setters
    public int getItemNumber() { return itemNumber; }
    public void setItemNumber(int itemNumber) { this.itemNumber = itemNumber; }
    public long getProcedureId() { return procedureId; }
    public void setProcedureId(long procedureId) { this.procedureId = procedureId; }
    public String getProcedureName() { return procedureName; }
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getRepetitionFrequency() { return repetitionFrequency; }
    public void setRepetitionFrequency(String repetitionFrequency) { this.repetitionFrequency = repetitionFrequency; }
    public boolean isRequiresSpecialist() { return requiresSpecialist; }
    public void setRequiresSpecialist(boolean requiresSpecialist) { this.requiresSpecialist = requiresSpecialist; }
    public String getSpecialistId() { return specialistId; }
    public void setSpecialistId(String specialistId) { this.specialistId = specialistId; }
    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }
}