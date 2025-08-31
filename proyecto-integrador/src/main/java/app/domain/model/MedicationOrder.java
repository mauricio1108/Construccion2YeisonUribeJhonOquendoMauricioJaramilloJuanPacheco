package app.domain.model;

public class MedicationOrder extends Order {

    private int itemNumber;
    private String medicationId;
    private String medicationName;
    private String dosage;
    private String treatmentDuration;
    private double cost;

    /*
    public MedicationOrder(int orderNumber, Patient patientId, String physicianId, java.util.Date creationDate, int itemNumber, String medicationId, String medicationName, String dosage, String treatmentDuration, double cost) {
        this.itemNumber = itemNumber;
        this.medicationId = medicationId;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.treatmentDuration = treatmentDuration;
        this.cost = cost;
    }*/

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getTreatmentDuration() {
        return treatmentDuration;
    }

    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
