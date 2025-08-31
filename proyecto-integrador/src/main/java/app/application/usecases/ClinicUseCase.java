
package app.application.usecases;

import app.domain.model.Patient;
import app.domain.model.DiagnosticAidOrder;
import app.domain.model.Role;
import app.domain.model.User;
import app.domain.model.ClinicalHistory;
import app.domain.services.CreateClinicalHistory;
import app.domain.services.CreateDiagnosticAidOrder;
import app.domain.services.CreatePatient;
import app.domain.services.CreateUser;
import app.domain.services.SearchDiagnosticAidOrderByPatient;
import java.util.List;




public class ClinicUseCase {
    
    private CreatePatient createPatient;
    private CreateDiagnosticAidOrder createDiagnosticOrder;
    private SearchDiagnosticAidOrderByPatient searchDiagnosticOrder;
    private CreateClinicalHistory createClinicalHistory;

    public void CreatePatient(Patient patient) throws Exception{
            createPatient.create(patient);
    }

    public void createOrder(DiagnosticAidOrder order) throws Exception {
            createDiagnosticOrder.create(order);
    }

    public List<DiagnosticAidOrder> searchOrders(Patient patient) throws Exception{
            return searchDiagnosticOrder.search(patient);
    }

    public void createClinicalRecord(ClinicalHistory clinicalHistory) throws Exception {
            createClinicalHistory.create(clinicalHistory);
    }
}
