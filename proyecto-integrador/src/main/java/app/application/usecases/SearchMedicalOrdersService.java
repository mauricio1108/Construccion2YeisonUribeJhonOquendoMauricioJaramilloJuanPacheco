package app.application.usecases;

import java.util.List;

import app.Infrastructure.persistence.entities.OrderEntity;
import app.Infrastructure.persistence.repository.OrderRepository;


public class SearchMedicalOrdersService extends MedicalStaffUseCase {

    private final OrderRepository orderRepository;

    public SearchMedicalOrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> getOrdersByPatient(long patientId) {
        return orderRepository.findByPatientId(patientId);
    }

}
