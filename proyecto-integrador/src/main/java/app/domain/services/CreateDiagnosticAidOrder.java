
package app.domain.services;

import app.domain.model.DiagnosticAid;
import app.domain.model.DiagnosticAidOrder;
import app.domain.model.Order;
import app.domain.ports.DiagnosticOrderPort;
import app.domain.ports.OrderPort;

public class CreateDiagnosticAidOrder {

    private OrderPort orderPort;
    private DiagnosticOrderPort diagnosticAidPort;

    public void createOrder(Order order, DiagnosticAid diagnosticAid) throws Exception {
        // Corrected method calls: getProcedureOrders() and getMedicationOrders()
        if (order.getProcedureOrders() != null && !order.getProcedureOrders().isEmpty()) {
            throw new IllegalArgumentException("Una orden de ayuda diagnóstica no puede contener procedimientos.");
        }
        if (order.getMedicationOrders() != null && !order.getMedicationOrders().isEmpty()) {
            throw new IllegalArgumentException("Una orden de ayuda diagnóstica no puede contener medicamentos.");
        }

        orderPort.save(order);
        diagnosticAidPort.save(diagnosticAid);
    }
}


