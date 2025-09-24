package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.OrderEntity;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    // Buscar una orden por su número
    OrderEntity findByOrderNumber(String orderNumber);

    // Buscar todas las órdenes de un paciente
    java.util.List<OrderEntity> findByPatientId(Long patientId);

    // Buscar todas las órdenes de un doctor
    java.util.List<OrderEntity> findByDoctorId(Long doctorId);
}