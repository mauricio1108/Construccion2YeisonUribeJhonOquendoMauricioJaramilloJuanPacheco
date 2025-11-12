package app.Infrastructure.adapters;

import app.domain.model.PatientRecord;
import app.domain.ports.DoctorPort;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class DoctorAdapter implements DoctorPort {

    private final Map<String, PatientRecord> database = new HashMap<>();

    @Override
    public void saveRecord(PatientRecord record) throws Exception {
        database.put(record.getId(), record);
        System.out.println("Registro del paciente guardado: " + record.getPatientName());
    }

    @Override
    public PatientRecord findRecordById(String id) throws Exception {
        return database.get(id);
    }
}