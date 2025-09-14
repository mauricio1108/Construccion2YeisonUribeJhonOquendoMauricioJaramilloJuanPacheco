
package app.domain.services;

import app.domain.model.DiagnosticAidOrder;
import app.domain.ports.OrderPort;
import java.util.List;
import java.util.stream.Collectors;

public class SearchDiagnosticAidOrderByPatient {

    private OrderPort orderPort;

    public List<DiagnosticAidOrder> searchByPatientId(String patientId) throws Exception {
        return orderPort.findByPatientId(patientId).stream()
                .flatMap(order -> order.getDiagnosticAidOrders().stream())
                .collect(Collectors.toList());
    }
}