/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.Order;
import app.domain.model.MedicationOrder;
import app.domain.ports.OrderPort;
import app.domain.ports.MedicationPort;
import app.domain.model.Medication;
import java.util.List;

public class CreateMedicationOrder {

    private OrderPort orderPort;
    private MedicationPort medicationPort;

    public void createMedicationOrder(Order order, List<MedicationOrder> medications) throws Exception {
        if (order.getDiagnosticAidOrders() != null && !order.getDiagnosticAidOrders().isEmpty()) {
            throw new IllegalArgumentException("No se pueden recetar medicamentos y ayudas diagnósticas en la misma orden.");
        }

        order.setMedicationOrders(medications);
        orderPort.save(order);
    }
}
