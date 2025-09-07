package app.application.usecases;

import app.domain.model.ClinicalRecord;
import app.domain.model.Order;
import app.domain.services.CreateClinicalHistory;
import app.domain.services.SearchClinicalHistoryByPatient;
import app.domain.services.CreateOrder;
import app.domain.services.CreateMedicationOrder;
import app.domain.services.CreateProcedureOrder;
import app.domain.services.CreateDiagnosticAidOrder;
import java.util.List;

public class MedicalStaffUseCase {

    private CreateClinicalHistory createClinicalHistoryService;
    private SearchClinicalHistoryByPatient searchClinicalHistoryService;
    private CreateOrder createOrderService;
    private CreateMedicationOrder createMedicationOrderService;
    private CreateProcedureOrder createProcedureOrderService;
    private CreateDiagnosticAidOrder createDiagnosticAidOrderService;

    public List<ClinicalRecord> searchHistory(String patientId) throws Exception {
        return searchClinicalHistoryService.searchByPatientId(patientId);
    }

    public void createMedicalRecord(String patientId, ClinicalRecord record) throws Exception {
        createClinicalHistoryService.createRecord(patientId, record);
    }

    public void updateMedicalRecord(String patientId, ClinicalRecord record) throws Exception {
        // Assuming an UpdateClinicalRecordService exists
        // updateClinicalRecordService.updateRecord(patientId, record);
    }

    public void createOrder(Order order) throws Exception {
        if (!order.getMedicationOrders().isEmpty() && !order.getProcedureOrders().isEmpty()) {
            createOrderService.saveOrder(order);
        } else if (!order.getMedicationOrders().isEmpty()) {
            createMedicationOrderService.createMedicationOrder(order, order.getMedicationOrders());
        } else if (!order.getProcedureOrders().isEmpty()) {
            createProcedureOrderService.createProcedureOrder(order, order.getProcedureOrders());
        } else if (!order.getDiagnosticAidOrders().isEmpty()) {
            createDiagnosticAidOrderService.createOrder(order, order.getDiagnosticAidOrders().get(0));
        } else {
            throw new IllegalArgumentException("The order must contain at least one item.");
        }
    }
}
