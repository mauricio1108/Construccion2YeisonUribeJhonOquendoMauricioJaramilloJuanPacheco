package app.domain.ports;


import app.domain.model.Incident;

public interface IncidentPort {
	
	void saveIncident(Incident incident) throws Exception;

    Incident findIncidentById(String incidentId) throws Exception;

    void updateIncident(Incident incident) throws Exception;

    void resolveIncident(String incidentId) throws Exception;

    void deleteIncident(String incidentId) throws Exception;
    
}
