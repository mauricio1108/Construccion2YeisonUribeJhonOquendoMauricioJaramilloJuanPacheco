package app.application.usecases;

import app.domain.model.Order;
import java.util.List;
import app.domain.repository.OrderRepository;


public class SearchMedicalOrdersService extends MedicalStaffUseCase {

	private final OrderRepository orderRepository;

	public SearchMedicalOrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersByPatient(String patientId) {
        return orderRepository.findByPatientId(patientId);
    }

}
