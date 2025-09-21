package app.Infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_insurances")
public class MedicalInsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "provider", nullable = false, length = 100)
    private String provider;

    @Column(name = "policy_number", nullable = false, unique = true, length = 50)
    private String policyNumber;

    // Constructores
    public MedicalInsuranceEntity() {}

    public MedicalInsuranceEntity(String provider, String policyNumber) {
        this.provider = provider;
        this.policyNumber = policyNumber;
    }

    // Getters y setters
    public Long getId() { return id; }

    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
}