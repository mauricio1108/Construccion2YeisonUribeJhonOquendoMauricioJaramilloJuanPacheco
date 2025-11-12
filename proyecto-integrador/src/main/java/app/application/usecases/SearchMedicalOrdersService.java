package app.application.usecases;

import java.util.List;

import app.domain.services.OrderService;
import app.domain.model.Order;

public class SearchMedicalOrdersService extends MedicalStaffUseCase {

    private final OrderService orderService;

    public SearchMedicalOrdersService(OrderService orderService) {
        this.orderService = orderService;
    }

    public List<Order> getOrdersByPatient(long patientId) throws Exception {
        return orderService.findByPatientId(patientId);
    }

}
