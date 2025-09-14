package app.domain.ports;

import app.domain.model.Patient;
import java.util.List;

public interface PatientPort {
    
    Patient findById(String id) throws Exception;

    List<Patient> findAll() throws Exception;

    void save(Patient patient) throws Exception;

    void update(Patient patient) throws Exception;

    void delete(String id) throws Exception;

}