package app.domain.ports;

import app.domain.model.Order;
import java.util.List;

public interface OrderPort {
   Order findById(String orderId) throws Exception;
    List<Order> findByPatientId(String patientId) throws Exception;
    void save(Order order) throws Exception; 
}
