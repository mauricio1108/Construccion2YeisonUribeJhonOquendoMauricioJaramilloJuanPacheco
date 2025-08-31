
package app.domain.ports;

import app.domain.model.ClinicalHistory;
import app.domain.model.Patient;
import java.util.List;

public interface ClinicalHistoryPort {
    
    public void save(ClinicalHistory clinicalHisotory) throws Exception;
    public List<ClinicalHistory> findByPatient(Patient patient) throws Exception;
        
}
