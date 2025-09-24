package app.Infrastructure.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.ProcedureOrderEntity;

@Repository
public interface ProcedureOrderRepository extends JpaRepository<ProcedureOrderEntity, Long> {

    List<ProcedureOrderEntity> findByOrderId(Long orderId);
}