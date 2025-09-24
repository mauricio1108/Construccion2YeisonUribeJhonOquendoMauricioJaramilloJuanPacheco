package app.Infrastructure.persistence.entities;


import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "patients")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identification_number", nullable = false, unique = true, length = 20)
    private String identificationNumber;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "gender", length = 20)
    private String gender;

    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emergency_contact_id", nullable = false)
    private EmergencyContactEntity emergencyContact;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medical_insurance_id", nullable = false)
    private MedicalInsuranceEntity medicalInsurance;

    // Constructores
    public PatientEntity() {}

    public PatientEntity(String identificationNumber, String fullName, Date birthDate, String gender,
                         String address, String phoneNumber, String email,
                         EmergencyContactEntity emergencyContact, MedicalInsuranceEntity medicalInsurance) {
        this.identificationNumber = identificationNumber;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.emergencyContact = emergencyContact;
        this.medicalInsurance = medicalInsurance;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public String getIdentificationNumber() { return identificationNumber; }
    public void setIdentificationNumber(String identificationNumber) { this.identificationNumber = identificationNumber; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public EmergencyContactEntity getEmergencyContact() { return emergencyContact; }
    public void setEmergencyContact(EmergencyContactEntity emergencyContact) { this.emergencyContact = emergencyContact; }

    public MedicalInsuranceEntity getMedicalInsurance() { return medicalInsurance; }
    public void setMedicalInsurance(MedicalInsuranceEntity medicalInsurance) { this.medicalInsurance = medicalInsurance; }
}