package app.application.usecases;

import app.domain.model.Incident;

public interface IncidentUseCase {

    void reportIncident(Incident incident) throws Exception;

    Incident findIncidentById(Long incidentId) throws Exception;

    void updateIncident(Incident incident) throws Exception;

    void resolveIncident(Long incidentId) throws Exception;

    void deleteIncident(Long incidentId) throws Exception;
}