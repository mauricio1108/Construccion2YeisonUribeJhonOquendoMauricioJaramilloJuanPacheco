package app.application.usecases;

import java.util.List;

import app.domain.model.Incident;

public interface SupportUseCase {
	void reportIncident(Incident incident) throws Exception;
    void updateIncidentStatus(String incidentId, String status) throws Exception;
    List<Incident> getOpenIncidents() throws Exception;

}
