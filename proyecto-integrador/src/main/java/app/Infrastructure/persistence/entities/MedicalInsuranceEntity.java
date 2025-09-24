package app.Infrastructure.persistence.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "medical_insurances")
public class MedicalInsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name", nullable = false, length = 100)
    private String companyName;

    @Column(name = "policy_number", nullable = false, unique = true, length = 50)
    private String policyNumber;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_date", nullable = false)
    private Date expirationDate;

    // Constructores
    public MedicalInsuranceEntity() {}

    public MedicalInsuranceEntity(String companyName, String policyNumber, boolean isActive, Date expirationDate) {
        this.companyName = companyName;
        this.policyNumber = policyNumber;
        this.isActive = isActive;
        this.expirationDate = expirationDate;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}