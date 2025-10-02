package app.application.usecases.impl;

import app.application.usecases.IncidentUseCase;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

public class IncidentUseCaseImpl implements IncidentUseCase {
	
    private final IncidentPort incidentPort;

    public IncidentUseCaseImpl(IncidentPort incidentPort) {
        this.incidentPort = incidentPort;
    }

    @Override
    public void reportIncident(Incident incident) throws Exception {
        incidentPort.saveIncident(incident);
    }

    @Override
    public Incident findIncidentById(Long incidentId) throws Exception {
        return incidentPort.findIncidentById(incidentId);
    }

    @Override
    public void updateIncident(Incident incident) throws Exception {
        incidentPort.updateIncident(incident);
    }

    @Override
    public void resolveIncident(Long incidentId) throws Exception {
        incidentPort.resolveIncident(incidentId);
    }

    @Override
    public void deleteIncident(Long incidentId) throws Exception {
        incidentPort.deleteIncident(incidentId);
    }
}
	
