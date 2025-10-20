
package app.domain.services;

import app.domain.model.DiagnosticAidOrder;
import app.domain.ports.OrderPort;
import java.util.List;
import java.util.stream.Collectors;

public class SearchDiagnosticAidOrderByPatient {


    private final OrderPort orderPort;

    public SearchDiagnosticAidOrderByPatient(OrderPort orderPort) {
        this.orderPort = orderPort;
    }

    public List<DiagnosticAidOrder> searchByPatientId(Long patientId) throws Exception {
        return orderPort.findByPatientId(patientId).stream()
                .flatMap(order -> order.getDiagnosticAidOrders().stream())
                .collect(Collectors.toList());
    }
}