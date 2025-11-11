package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.PatientEntity;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    // PatientEntity uses 'identificationNumber' and 'email'
    PatientEntity findByIdentificationNumber(String identificationNumber);

    PatientEntity findByEmail(String email);
}