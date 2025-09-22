package app.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.infrastructure.persistence.entities.DiagnosticAidOrderEntity;

import java.util.List;

@Repository
public interface DiagnosticAidOrderRepository extends JpaRepository<DiagnosticAidOrderEntity, Long> {

    List<DiagnosticAidOrderEntity> findByOrderId(Long orderId);
}