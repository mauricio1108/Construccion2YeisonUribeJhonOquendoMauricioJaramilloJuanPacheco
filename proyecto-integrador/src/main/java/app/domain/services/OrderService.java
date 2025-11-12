package app.domain.services;

import app.domain.model.Order;
import app.domain.ports.OrderPort;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderPort orderPort;

    public OrderService(OrderPort orderPort) {
        this.orderPort = orderPort;
    }

    public void saveOrder(Order order) throws Exception {
        // Validate unique items in the order (same logic as CreateOrder)
        long distinctItems = java.util.stream.Stream.concat(
            order.getMedicationOrders() != null ? order.getMedicationOrders().stream().map(m -> m.getItemNumber()) : java.util.stream.Stream.empty(),
            java.util.stream.Stream.concat(
                order.getProcedureOrders() != null ? order.getProcedureOrders().stream().map(p -> p.getItemNumber()) : java.util.stream.Stream.empty(),
                order.getDiagnosticAidOrders() != null ? order.getDiagnosticAidOrders().stream().map(d -> d.getItemNumber()) : java.util.stream.Stream.empty()
            )
        ).distinct().count();

        long totalItems = (order.getMedicationOrders() != null ? order.getMedicationOrders().size() : 0) +
                          (order.getProcedureOrders() != null ? order.getProcedureOrders().size() : 0) +
                          (order.getDiagnosticAidOrders() != null ? order.getDiagnosticAidOrders().size() : 0);

        if (distinctItems != totalItems) {
            throw new IllegalArgumentException("No puede existir dos elementos con el mismo ítem dentro de la misma orden.");
        }

        // persist
        orderPort.save(order);
    }

    public List<Order> findByPatientDocument(String patientDocument) throws Exception {
        return orderPort.findByPatientDocument(patientDocument);
    }

    public List<Order> findByPatientId(Long patientId) throws Exception {
        return orderPort.findByPatientId(patientId);
    }

    public List<Order> findByDoctorId(Long doctorId) throws Exception {
        return orderPort.findByDoctorId(doctorId);
    }

    public boolean existsByOrderNumber(String orderNumber) {
        return orderPort.existsByOrderNumber(orderNumber);
    }
}
