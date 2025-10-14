package app.application.usecases;

import app.domain.model.Order;
import app.domain.model.Patient;
import java.util.List;

public interface DoctorUseCase {

    void createMedicationOrder(Order order) throws Exception;
    void createProcedureOrder(Order order) throws Exception;
    void createDiagnosticAidOrder(Order order) throws Exception;

    List<Order> findOrdersByPatient(String patientDocument) throws Exception;
}