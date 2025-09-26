package app.application.usecases;


import app.domain.model.Incident;

public interface SupportUseCase {
	
	void createIncident(Incident incident) throws Exception;

    Incident getIncidentById(String incidentId) throws Exception;

    void updateIncident(Incident incident) throws Exception;

    void resolveIncident(String incidentId) throws Exception;

    void deleteIncident(String incidentId) throws Exception;

}
