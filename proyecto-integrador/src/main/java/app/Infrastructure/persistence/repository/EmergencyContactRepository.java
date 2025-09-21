package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.EmergencyContactEntity;

@Repository
public interface EmergencyContactRepository extends JpaRepository<EmergencyContactEntity, Long> {

    EmergencyContactEntity findByPhoneNumber(String phoneNumber);
}