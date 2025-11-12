package app.domain.services;

import org.springframework.stereotype.Service;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

@Service
public class IncidentService {

    private final IncidentPort incidentPort;

    public IncidentService(IncidentPort incidentPort) {
        this.incidentPort = incidentPort;
    }

    public void reportIncident(Incident incident) throws Exception {
        incidentPort.saveIncident(incident);
    }

    public Incident findIncidentById(Long incidentId) throws Exception {
        return incidentPort.findIncidentById(incidentId);
    }

    public void updateIncident(Incident incident) throws Exception {
        incidentPort.updateIncident(incident);
    }

    public void resolveIncident(Long incidentId) throws Exception {
        incidentPort.resolveIncident(incidentId);
    }

    public void deleteIncident(Long incidentId) throws Exception {
        incidentPort.deleteIncident(incidentId);
    }
}
