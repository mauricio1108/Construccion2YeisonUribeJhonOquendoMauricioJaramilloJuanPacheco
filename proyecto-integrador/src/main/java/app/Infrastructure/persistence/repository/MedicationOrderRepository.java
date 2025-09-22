package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.MedicationOrderEntity;

import java.util.List;

@Repository
public interface MedicationOrderRepository extends JpaRepository<MedicationOrderEntity, Long> {

    List<MedicationOrderEntity> findByOrderId(Long orderId);
}