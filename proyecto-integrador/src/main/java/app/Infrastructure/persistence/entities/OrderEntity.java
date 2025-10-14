package app.Infrastructure.persistence.entities;


import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders") // "order" es palabra reservada en MySQL, mejor pluralizar
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number", nullable = false, unique = true, length = 50)
    private String orderNumber;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", nullable = false)
    private UserEntity doctor;

    @Column(name = "creation_date", nullable = false)
    private Date creationDate;
    
    @Column(name = "order_type", nullable = false, length = 50)
    private String orderType;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MedicationOrderEntity> medicationOrders;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProcedureOrderEntity> procedureOrders;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiagnosticAidOrderEntity> diagnosticAidOrders;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PatientEntity getPatient() {
        return patient;
    }

    public void setPatient(PatientEntity patient) {
        this.patient = patient;
    }

    public UserEntity getDoctor() {
        return doctor;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setDoctor(UserEntity doctor) {
        this.doctor = doctor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<MedicationOrderEntity> getMedicationOrders() {
        return medicationOrders;
    }

    public void setMedicationOrders(List<MedicationOrderEntity> medicationOrders) {
        this.medicationOrders = medicationOrders;
    }

    public List<ProcedureOrderEntity> getProcedureOrders() {
        return procedureOrders;
    }

    public void setProcedureOrders(List<ProcedureOrderEntity> procedureOrders) {
        this.procedureOrders = procedureOrders;
    }

    public List<DiagnosticAidOrderEntity> getDiagnosticAidOrders() {
        return diagnosticAidOrders;
    }

    public void setDiagnosticAidOrders(List<DiagnosticAidOrderEntity> diagnosticAidOrders) {
        this.diagnosticAidOrders = diagnosticAidOrders;
    }
}
