package app.domain.ports;

import app.domain.model.DiagnosticAid;
import app.domain.model.DiagnosticAidOrder;
import java.util.List;
import app.domain.model.Patient;

public interface DiagnosticOrderPort {

    DiagnosticAid findById(String aidId) throws Exception;
    void save(DiagnosticAid diagnosticAid) throws Exception;
    void update(DiagnosticAid diagnosticAid) throws Exception;
    void delete(String aidId) throws Exception;
}
