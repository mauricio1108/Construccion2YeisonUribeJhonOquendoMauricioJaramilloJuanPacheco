package app.Infrastructure.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.DiagnosticAidOrderEntity;

@Repository
public interface DiagnosticAidOrderRepository extends JpaRepository<DiagnosticAidOrderEntity, Long> {

    List<DiagnosticAidOrderEntity> findByOrderId(Long orderId);
}