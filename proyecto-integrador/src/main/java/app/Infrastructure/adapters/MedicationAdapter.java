package app.Infrastructure.adapters;

import app.domain.model.Medication;
import app.domain.ports.MedicationPort;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MedicationAdapter implements MedicationPort {

    private final Map<String, Medication> storage = new HashMap<>();

    @Override
    public Medication findById(String medicationId) throws Exception {
        return storage.get(medicationId);
    }

    @Override
    public void save(Medication medication) throws Exception {
        storage.put(medication.getId(), medication);
    }

    @Override
    public void update(Medication medication) throws Exception {
        storage.put(medication.getId(), medication);
    }

    @Override
    public void delete(String medicationId) throws Exception {
        storage.remove(medicationId);
    }
}
