package app.application.usecases.impl;

import app.application.usecases.IncidentUseCase;
import app.domain.model.Incident;
import app.domain.services.IncidentService;
import org.springframework.stereotype.Service;

@Service
public class IncidentUseCaseImpl implements IncidentUseCase {
    
    private final IncidentService incidentService;

    public IncidentUseCaseImpl(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @Override
    public void reportIncident(Incident incident) throws Exception {
        incidentService.reportIncident(incident);
    }

    @Override
    public Incident findIncidentById(Long incidentId) throws Exception {
        return incidentService.findIncidentById(incidentId);
    }

    @Override
    public void updateIncident(Incident incident) throws Exception {
        incidentService.updateIncident(incident);
    }

    @Override
    public void resolveIncident(Long incidentId) throws Exception {
        incidentService.resolveIncident(incidentId);
    }

    @Override
    public void deleteIncident(Long incidentId) throws Exception {
        incidentService.deleteIncident(incidentId);
    }
}
	
