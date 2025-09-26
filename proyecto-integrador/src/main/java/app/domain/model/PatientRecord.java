package app.domain.model;

public class PatientRecord {
	
		private String id;
	    private String patientName;
	    private String doctorId;
	    private String diagnosis;
	    private String treatment;
	    private String date;
	    
	    
	    public PatientRecord(String id, String patientName, String doctorId, String diagnosis, String treatment, String date) {
	        this.id = id;
	        this.patientName = patientName;
	        this.doctorId = doctorId;
	        this.diagnosis = diagnosis;
	        this.treatment = treatment;
	        this.date = date;
	    }

	    // Getters y Setters
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getPatientName() {
	        return patientName;
	    }

	    public void setPatientName(String patientName) {
	        this.patientName = patientName;
	    }

	    public String getDoctorId() {
	        return doctorId;
	    }

	    public void setDoctorId(String doctorId) {
	        this.doctorId = doctorId;
	    }

	    public String getDiagnosis() {
	        return diagnosis;
	    }

	    public void setDiagnosis(String diagnosis) {
	        this.diagnosis = diagnosis;
	    }

	    public String getTreatment() {
	        return treatment;
	    }

	    public void setTreatment(String treatment) {
	        this.treatment = treatment;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }
	}
