package app.domain.model;

import java.util.List;

public class Invoice {

    private Patient patient; // Objeto Patient en lugar de nombre, edad y cédula
    private User treatingDoctor; // Objeto User en lugar de nombre del médico
    private MedicalInsurance insurance; // Objeto MedicalInsurance en lugar de detalles separados
    private double totalCost;
    private double patientPayment;
    private double insurancePayment;
    private List<InvoiceItem> items; // Lista de ítems para el desglose de la factura

    // Getters y Setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public User getTreatingDoctor() {
        return treatingDoctor;
    }

    public void setTreatingDoctor(User treatingDoctor) {
        this.treatingDoctor = treatingDoctor;
    }

    public MedicalInsurance getInsurance() {
        return insurance;
    }

    public void setInsurance(MedicalInsurance insurance) {
        this.insurance = insurance;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getPatientPayment() {
        return patientPayment;
    }

    public void setPatientPayment(double patientPayment) {
        this.patientPayment = patientPayment;
    }

    public double getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(double insurancePayment) {
        this.insurancePayment = insurancePayment;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }
    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }
}