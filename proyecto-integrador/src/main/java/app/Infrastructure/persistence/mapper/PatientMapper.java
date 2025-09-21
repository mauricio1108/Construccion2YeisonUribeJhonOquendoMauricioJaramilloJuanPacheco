package app.Infrastructure.persistence.mapper;

import app.domain.model.Patient;
import app.domain.model.EmergencyContact;
import app.domain.model.MedicalInsurance;
import app.Infrastructure.persistence.entities.PatientEntity;
import app.Infrastructure.persistence.entities.EmergencyContactEntity;
import app.Infrastructure.persistence.entities.MedicalInsuranceEntity;

public class PatientMapper {

    public static PatientEntity toEntity(Patient patient) {
        if (patient == null) return null;

        EmergencyContactEntity emergencyContactEntity = EmergencyContactMapper.toEntity(patient.getEmergencyContact());
        MedicalInsuranceEntity medicalInsuranceEntity = MedicalInsuranceMapper.toEntity(patient.getMedicalInsurance());

        return new PatientEntity(
                patient.getIdentificationNumber(),
                patient.getFullName(),
                patient.getBirthDate(),
                patient.getGender(),
                patient.getAddress(),
                patient.getPhoneNumber(),
                patient.getEmail(),
                emergencyContactEntity,
                medicalInsuranceEntity
        );
    }

    public static Patient toDomain(PatientEntity entity) {
        if (entity == null) return null;

        EmergencyContact emergencyContact = EmergencyContactMapper.toDomain(entity.getEmergencyContact());
        MedicalInsurance medicalInsurance = MedicalInsuranceMapper.toDomain(entity.getMedicalInsurance());

        return new Patient(
                entity.getIdentificationNumber(),
                entity.getFullName(),
                entity.getBirthDate(),
                entity.getGender(),
                entity.getAddress(),
                entity.getPhoneNumber(),
                entity.getEmail(),
                emergencyContact,
                medicalInsurance
        );
    }
}