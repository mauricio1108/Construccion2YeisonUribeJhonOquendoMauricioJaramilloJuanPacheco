package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.MedicalInsuranceEntity;

@Repository
public interface MedicalInsuranceRepository extends JpaRepository<MedicalInsuranceEntity, Long> {

    // Entity field is 'companyName' and 'policyNumber'
    MedicalInsuranceEntity findByCompanyName(String companyName);

    MedicalInsuranceEntity findByPolicyNumber(String policyNumber);
}