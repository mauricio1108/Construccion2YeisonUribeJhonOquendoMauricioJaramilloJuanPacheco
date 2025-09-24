package app.domain.model;

import java.util.Date;
import java.util.Map;


public class ClinicalHistory {
    private long id; // Identificador único
    private Patient patient; // Referencia al paciente
    private String doctorCedula; // Cédula del médico
    private Map<Date, Entry> entries; // Múltiples entradas por fecha
    private Order order; // Referencia a la orden clínica

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctorCedula() {
        return doctorCedula;
    }

    public void setDoctorCedula(String doctorCedula) {
        this.doctorCedula = doctorCedula;
    }

    public Map<Date, Entry> getEntries() {
        return entries;
    }

    public void setEntries(Map<Date, Entry> entries) {
        this.entries = entries;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
