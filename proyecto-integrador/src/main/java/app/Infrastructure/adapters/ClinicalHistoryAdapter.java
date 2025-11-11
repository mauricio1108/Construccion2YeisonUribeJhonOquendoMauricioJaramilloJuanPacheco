package app.Infrastructure.adapters;

import app.domain.model.ClinicalRecord;
import app.domain.ports.ClinicalHistoryPort;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;

@Component
public class ClinicalHistoryAdapter implements ClinicalHistoryPort {

    private final Map<String, List<ClinicalRecord>> storage = new HashMap<>();

    @Override
    public ClinicalRecord findByDate(String patientId, LocalDate date) throws Exception {
        var list = storage.getOrDefault(patientId, Collections.emptyList());
        return list.stream().filter(r -> r.getDate() != null && r.getDate().equals(date)).findFirst().orElse(null);
    }

    @Override
    public List<ClinicalRecord> findByPatientId(String patientId) throws Exception {
        return new ArrayList<>(storage.getOrDefault(patientId, Collections.emptyList()));
    }

    @Override
    public void save(String patientId, ClinicalRecord record) throws Exception {
        storage.computeIfAbsent(patientId, k -> new ArrayList<>()).add(record);
    }
}
