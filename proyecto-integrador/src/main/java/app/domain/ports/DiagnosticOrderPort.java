package app.domain.ports;

import app.domain.model.DiagnosticAidOrder;
import java.util.List;
import app.domain.model.Patient;

public interface DiagnosticOrderPort {

    public DiagnosticAidOrder findById(DiagnosticAidOrder diagnosticorder) throws Exception;

    public List<DiagnosticAidOrder> findByPatient(Patient patient) throws Exception;

    public void save(DiagnosticAidOrder diagnosticOrder) throws Exception;
}
