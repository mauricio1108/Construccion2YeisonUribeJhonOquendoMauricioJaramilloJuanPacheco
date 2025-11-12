package app.application.usecases.impl;

import app.application.usecases.DoctorUseCase;
import app.domain.model.Order;
import app.domain.services.OrderService;
import app.domain.validator.CommonsValidator;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorUseCaseImpl implements DoctorUseCase {

    private final OrderService orderService;
    private final CommonsValidator commonsValidator;

    public DoctorUseCaseImpl(OrderService orderService, CommonsValidator commonsValidator) {
        this.orderService = orderService;
        this.commonsValidator = commonsValidator;
    }

    @Override
    public void createMedicationOrder(Order order) throws Exception {
        commonsValidator.isValidString("el tipo de orden", order.getOrderType());
        orderService.saveOrder(order);
        System.out.println("Orden de medicamentos creada correctamente.");
    }

    @Override
    public void createProcedureOrder(Order order) throws Exception {
        orderService.saveOrder(order);
        System.out.println("Orden de procedimiento creada correctamente.");
    }

    @Override
    public void createDiagnosticAidOrder(Order order) throws Exception {
        orderService.saveOrder(order);
        System.out.println("Orden de ayuda diagnóstica creada correctamente.");
    }

    @Override
    public List<Order> findOrdersByPatient(String identificationNumber) throws Exception {
        return orderService.findByPatientDocument(identificationNumber);
    }
}