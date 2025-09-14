package app.domain.model;

import java.time.LocalDate;
import java.util.List;

public class ClinicalRecord {

    private LocalDate date;
    private User attendingDoctor; // Cambiado de 'String attendingDoctorId' a 'User attendingDoctor'
    private String reasonForConsultation;
    private String symptoms;
    private String diagnosis;
    private List<MedicationOrder> medications;
    private List<ProcedureOrder> procedures;
    private List<DiagnosticAidOrder> diagnosticAids;

    // Getters y Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getAttendingDoctor() {
        return attendingDoctor;
    }

    public void setAttendingDoctor(User attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public String getReasonForConsultation() {
        return reasonForConsultation;
    }

    public void setReasonForConsultation(String reasonForConsultation) {
        this.reasonForConsultation = reasonForConsultation;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public List<MedicationOrder> getMedications() {
        return medications;
    }

    public void setMedications(List<MedicationOrder> medications) {
        this.medications = medications;
    }

    public List<ProcedureOrder> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<ProcedureOrder> procedures) {
        this.procedures = procedures;
    }

    public List<DiagnosticAidOrder> getDiagnosticAids() {
        return diagnosticAids;
    }

    public void setDiagnosticAids(List<DiagnosticAidOrder> diagnosticAids) {
        this.diagnosticAids = diagnosticAids;
    }
}