// app/infrastructure/persistence/repository/OrderRepository.java
package app.infrastructure.persistence.repository;

import app.Infrastructure.persistence.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    // Buscar por ID del paciente
    List<OrderEntity> findByPatientId(Long patientId);

    // Buscar por documento del paciente
    @Query("SELECT o FROM OrderEntity o WHERE o.patient.document = :patientDocument")
    List<OrderEntity> findByPatientDocument(@Param("patientDocument") String patientDocument);

    // Buscar por ID del doctor
    List<OrderEntity> findByDoctorId(Long doctorId);
    
    // Buscar por número de orden
    Optional<OrderEntity> findByOrderNumber(String orderNumber);
    
    // Verificar si existe un número de orden
    boolean existsByOrderNumber(String orderNumber);
}