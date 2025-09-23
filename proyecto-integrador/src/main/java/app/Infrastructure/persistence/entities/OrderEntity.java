package app.infrastructure.persistence.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MedicationOrderEntity> medicationOrders = new HashSet<>();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ProcedureOrderEntity> procedureOrders = new HashSet<>();

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DiagnosticAidOrderEntity> diagnosticAidOrders = new HashSet<>();

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

    public void setDoctor(UserEntity doctor) {
        this.doctor = doctor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<MedicationOrderEntity> getMedicationOrders() {
        return medicationOrders;
    }

    public void setMedicationOrders(Set<MedicationOrderEntity> medicationOrders) {
        this.medicationOrders = medicationOrders;
    }

    public Set<ProcedureOrderEntity> getProcedureOrders() {
        return procedureOrders;
    }

    public void setProcedureOrders(Set<ProcedureOrderEntity> procedureOrders) {
        this.procedureOrders = procedureOrders;
    }

    public Set<DiagnosticAidOrderEntity> getDiagnosticAidOrders() {
        return diagnosticAidOrders;
    }

    public void setDiagnosticAidOrders(Set<DiagnosticAidOrderEntity> diagnosticAidOrders) {
        this.diagnosticAidOrders = diagnosticAidOrders;
    }
}
