package app.domain.model;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private String orderNumber;
    private Patient patient;
    private User doctor;
    private LocalDate creationDate;
    private List<MedicationOrder> medicationOrders;
    private List<ProcedureOrder> procedureOrders;
    private List<DiagnosticAidOrder> diagnosticAidOrders;

    public String getOrderNumber() {
        return orderNumber;
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

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
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