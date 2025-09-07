package app.domain.model;

public class Entry {
    private long id;
    private String consultationReason; 
    private String symptoms; 
    private String diagnosis; 

   
    public Entry(long id, String consultationReason, String symptoms, String diagnosis) {
        this.id = id;
        this.consultationReason = consultationReason;
        this.symptoms = symptoms;
        this.diagnosis = diagnosis;
    }

    
    public long getId() {
        return id;
    }

    public String getConsultationReason() {
        return consultationReason;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setConsultationReason(String consultationReason) {
        this.consultationReason = consultationReason;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}