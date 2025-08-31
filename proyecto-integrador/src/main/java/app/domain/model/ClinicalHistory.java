package app.domain.model;

import java.util.Date;
import java.util.Map;

public class ClinicalHistory {
    private Patient patient;
    private User doctor;
    private Date consultationDate;
    private String physicianId;
    private String reasonForConsultation;
    private String symptoms;
    private String diagnosis;
    private Map<String, Object> details;
    private DiagnosticAidOrder diagnosticOrder;

    public DiagnosticAidOrder getDiagnosticOrder() {
        return diagnosticOrder;
    }

    public void setDiagnosticOrder(DiagnosticAidOrder diagnosticOrder) {
        this.diagnosticOrder = diagnosticOrder;
    }
 
    /*
    public ClinicalHistory(String patientId, Date consultationDate, String physicianId, String reasonForConsultation, String symptoms, String diagnosis, Map<String, Object> details) {
        this.patientId = patientId;
        this.consultationDate = consultationDate;
        this.physicianId = physicianId;
        this.reasonForConsultation = reasonForConsultation;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
        this.details = details;
    }*/

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
 
    
    public Date getConsultationDate() { return consultationDate; }
    public void setConsultationDate(Date consultationDate) { this.consultationDate = consultationDate; }
    public String getPhysicianId() { return physicianId; }
    public void setPhysicianId(String physicianId) { this.physicianId = physicianId; }
    public String getReasonForConsultation() { return reasonForConsultation; }
    public void setReasonForConsultation(String reasonForConsultation) { this.reasonForConsultation = reasonForConsultation; }
    public String getSymptoms() { return symptoms; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public Map<String, Object> getDetails() { return details; }
    public void setDetails(Map<String, Object> details) { this.details = details; }
}
