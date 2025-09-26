package app.domain.model;

import java.time.LocalDateTime;


public class NursingRecord {
	
	private Long id;
    private Long patientId;
    private String observations;
    private String medicationAdministered;
    private LocalDateTime createdAt;
    
    public NursingRecord() {}

    public NursingRecord(Long id, Long patientId, String observations, String medicationAdministered, LocalDateTime createdAt) {
        this.id = id;
        this.patientId = patientId;
        this.observations = observations;
        this.medicationAdministered = medicationAdministered;
        this.createdAt = createdAt;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPatientId() { return patientId; }
    public void setPatientId(Long patientId) { this.patientId = patientId; }

    public String getObservations() { return observations; }
    public void setObservations(String observations) { this.observations = observations; }

    public String getMedicationAdministered() { return medicationAdministered; }
    public void setMedicationAdministered(String medicationAdministered) { this.medicationAdministered = medicationAdministered; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}

