package app.application.usecases.impl;

import app.application.usecases.DoctorUseCase;
import app.domain.model.Order;
import app.domain.ports.OrderPort;
import app.domain.validator.CommonsValidator;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorUseCaseImpl implements DoctorUseCase {

    private final OrderPort orderPort;
    private final CommonsValidator commonsValidator;

    public DoctorUseCaseImpl(OrderPort orderPort, CommonsValidator commonsValidator) {
        this.orderPort = orderPort;
        this.commonsValidator = commonsValidator;
    }

    @Override
    public void createMedicationOrder(Order order) throws Exception {
        commonsValidator.isValidString("el tipo de orden", order.getOrderType());
        orderPort.save(order);
        System.out.println("Orden de medicamentos creada correctamente.");
    }

    @Override
    public void createProcedureOrder(Order order) throws Exception {
        orderPort.save(order);
        System.out.println("Orden de procedimiento creada correctamente.");
    }

    @Override
    public void createDiagnosticAidOrder(Order order) throws Exception {
        orderPort.save(order);
        System.out.println("Orden de ayuda diagnóstica creada correctamente.");
    }

    @Override
    public List<Order> findOrdersByPatient(String identificationNumber) throws Exception {
        return orderPort.findByPatientDocument(identificationNumber);
    }
}