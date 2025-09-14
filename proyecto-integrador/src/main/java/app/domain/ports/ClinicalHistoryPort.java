
package app.domain.ports;

import app.domain.model.ClinicalRecord;
import java.time.LocalDate;
import java.util.List;

public interface ClinicalHistoryPort {
    
    ClinicalRecord findByDate(String patientId, LocalDate date) throws Exception;

    List<ClinicalRecord> findByPatientId(String patientId) throws Exception;

    void save(String patientId, ClinicalRecord record) throws Exception;
}
