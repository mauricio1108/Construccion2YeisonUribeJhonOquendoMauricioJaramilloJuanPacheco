/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.Order;
import app.domain.model.MedicationOrder;
import app.domain.model.ProcedureOrder;
import app.domain.model.DiagnosticAidOrder;
import app.domain.ports.OrderPort;
import java.util.stream.Stream;

public class CreateOrder {

    private OrderPort orderPort;

    public void saveOrder(Order order) throws Exception {
        long distinctItems = Stream.concat(
            order.getMedicationOrders().stream().map(MedicationOrder::getItemNumber),
            Stream.concat(
                order.getProcedureOrders().stream().map(ProcedureOrder::getItemNumber),
                order.getDiagnosticAidOrders().stream().map(DiagnosticAidOrder::getItemNumber)
            )
        ).distinct().count();

        long totalItems = order.getMedicationOrders().size() +
                          order.getProcedureOrders().size() +
                          order.getDiagnosticAidOrders().size();

        if (distinctItems != totalItems) {
            throw new IllegalArgumentException("No puede existir dos elementos con el mismo ítem dentro de la misma orden.");
        }

        orderPort.save(order);
    }
}