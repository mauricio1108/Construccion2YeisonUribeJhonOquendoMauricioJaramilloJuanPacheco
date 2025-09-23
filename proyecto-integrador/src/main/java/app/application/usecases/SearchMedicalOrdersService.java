package app.application.usecases;

import app.domain.model.Order;
import java.util.List;
//import app.domain.repository.OrderRepository;
import app.infrastructure.persistence.entities.OrderEntity;
import app.infrastructure.persistence.repository.OrderRepository;


public class SearchMedicalOrdersService extends MedicalStaffUseCase {

    private final OrderRepository orderRepository;

    public SearchMedicalOrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getOrdersByPatient(long patientId) {
        return orderRepository.findByPatientId(patientId);
    }

}
