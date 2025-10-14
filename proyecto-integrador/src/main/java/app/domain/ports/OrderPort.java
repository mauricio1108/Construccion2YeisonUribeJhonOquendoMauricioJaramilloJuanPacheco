package app.domain.ports;

import app.domain.model.Order;
import java.util.List;
import java.util.Optional;

public interface OrderPort {
    Order save(Order order);
    Optional<Order> findById(Long orderId);
    List<Order> findByPatientId(Long patientId);
    List<Order> findByPatientDocument(String patientDocument);
    List<Order> findByDoctorId(Long doctorId);
    Optional<Order> findByOrderNumber(String orderNumber);
    boolean existsByOrderNumber(String orderNumber);
}