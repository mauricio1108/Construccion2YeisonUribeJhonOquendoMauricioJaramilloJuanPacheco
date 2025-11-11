package app.Infrastructure.adapters;

import app.domain.model.Procedure;
import app.domain.ports.ProcedurePort;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProcedureAdapter implements ProcedurePort {

    private final Map<String, Procedure> storage = new HashMap<>();

    @Override
    public Procedure findById(String procedureId) throws Exception {
        return storage.get(procedureId);
    }

    @Override
    public void save(Procedure procedure) throws Exception {
        storage.put(procedure.getId(), procedure);
    }

    @Override
    public void update(Procedure procedure) throws Exception {
        storage.put(procedure.getId(), procedure);
    }

    @Override
    public void delete(String procedureId) throws Exception {
        storage.remove(procedureId);
    }
}
