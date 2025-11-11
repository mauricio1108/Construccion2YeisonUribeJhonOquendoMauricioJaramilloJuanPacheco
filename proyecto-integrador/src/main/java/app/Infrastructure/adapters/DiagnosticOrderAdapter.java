package app.Infrastructure.adapters;

import app.domain.model.DiagnosticAid;
import app.domain.ports.DiagnosticOrderPort;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DiagnosticOrderAdapter implements DiagnosticOrderPort {

    private final Map<String, DiagnosticAid> storage = new HashMap<>();

    @Override
    public DiagnosticAid findById(String aidId) throws Exception {
        return storage.get(aidId);
    }

    @Override
    public void save(DiagnosticAid diagnosticAid) throws Exception {
        storage.put(diagnosticAid.getId(), diagnosticAid);
    }

    @Override
    public void update(DiagnosticAid diagnosticAid) throws Exception {
        storage.put(diagnosticAid.getId(), diagnosticAid);
    }

    @Override
    public void delete(String aidId) throws Exception {
        storage.remove(aidId);
    }
}
