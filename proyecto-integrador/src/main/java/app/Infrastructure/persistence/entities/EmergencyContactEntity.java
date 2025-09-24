package app.Infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "emergency_contacts")
public class EmergencyContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "relationship", length = 50)
    private String relationship;

    // Constructores
    public EmergencyContactEntity() {}

    public EmergencyContactEntity(String fullName, String phoneNumber, String relationship) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.relationship = relationship;
    }

    // Getters y setters
    public Long getId() { return id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getRelationship() { return relationship; }
    public void setRelationship(String relationship) { this.relationship = relationship; }
}