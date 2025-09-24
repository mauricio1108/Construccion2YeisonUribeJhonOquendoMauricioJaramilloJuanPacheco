package app.Infrastructure.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.MedicationOrderEntity;

@Repository
public interface MedicationOrderRepository extends JpaRepository<MedicationOrderEntity, Long> {

    List<MedicationOrderEntity> findByOrderId(Long orderId);
}