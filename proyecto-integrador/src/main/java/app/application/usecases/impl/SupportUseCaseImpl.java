package app.application.usecases.impl;

import app.application.usecases.SupportUseCase;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

public class SupportUseCaseImpl implements SupportUseCase {
	
	private final IncidentPort incidentPort;

    public SupportUseCaseImpl(IncidentPort incidentPort) {
        this.incidentPort = incidentPort;
    }

    @Override
    public void createIncident(Incident incident) throws Exception {
        incidentPort.saveIncident(incident);
    }

    @Override
    public Incident getIncidentById(String incidentId) throws Exception {
        return incidentPort.findIncidentById(incidentId);
    }

    @Override
    public void updateIncident(Incident incident) throws Exception {
        incidentPort.updateIncident(incident);
    }

    @Override
    public void resolveIncident(String incidentId) throws Exception {
        incidentPort.resolveIncident(incidentId);
    }

    @Override
    public void deleteIncident(String incidentId) throws Exception {
        incidentPort.deleteIncident(incidentId);
    }
}
