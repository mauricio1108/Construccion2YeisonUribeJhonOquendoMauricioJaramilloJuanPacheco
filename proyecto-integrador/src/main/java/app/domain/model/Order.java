package app.domain.model;

import java.util.Date;

public class Order {

    private int orderNumber; // Max 6 digits
    private Patient patient;
    private String physicianId;
    private Date creationDate;

    /*public Order(int orderNumber, String physicianId, Date creationDate) {
        this.orderNumber = orderNumber;
        this.physicianId = physicianId;
        this.creationDate = creationDate;
    }*/
    
    // Getters and setters
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
