package app.domain.model;

import java.sql.Date;
import java.util.List;

public class Order {

    private String orderNumber;
    private Patient patient;
    private User doctor;
    private Date creationDate;
    private List<MedicationOrder> medicationOrders;
    private List<ProcedureOrder> procedureOrders;
    private List<DiagnosticAidOrder> diagnosticAidOrders;
    private String orderType;

    public String getOrderNumber() {
        return orderNumber;
    }

    public Order() {
    }
    
    public Order(String orderNumber, Patient patient, User doctor, Date creationDate, String orderType) {
    this.orderNumber = orderNumber;
    this.patient = patient;
    this.doctor = doctor;
    this.creationDate = creationDate;
    this.orderType = orderType;
}

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<MedicationOrder> getMedicationOrders() {
        return medicationOrders;
    }

    public void setMedicationOrders(List<MedicationOrder> medicationOrders) {
        this.medicationOrders = medicationOrders;
    }

    public List<ProcedureOrder> getProcedureOrders() {
        return procedureOrders;
    }

    public void setProcedureOrders(List<ProcedureOrder> procedureOrders) {
        this.procedureOrders = procedureOrders;
    }

    public List<DiagnosticAidOrder> getDiagnosticAidOrders() {
        return diagnosticAidOrders;
    }

    public void setDiagnosticAidOrders(List<DiagnosticAidOrder> diagnosticAidOrders) {
        this.diagnosticAidOrders = diagnosticAidOrders;
    }
}