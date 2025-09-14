/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.Order;
import app.domain.model.ProcedureOrder;
import app.domain.ports.OrderPort;
import app.domain.ports.ProcedurePort;
import java.util.List;

public class CreateProcedureOrder {

    private OrderPort orderPort;
    private ProcedurePort procedurePort;

    public void createProcedureOrder(Order order, List<ProcedureOrder> procedures) throws Exception {
        if (order.getDiagnosticAidOrders() != null && !order.getDiagnosticAidOrders().isEmpty()) {
            throw new IllegalArgumentException("No se pueden recetar procedimientos y ayudas diagnósticas en la misma orden.");
        }

        order.setProcedureOrders(procedures);
        orderPort.save(order);
    }
}