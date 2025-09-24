package app.domain.ports;

import java.util.List;

import app.domain.model.Incident;

public interface IncidentPort {
	
	Incident createIncident(Incident incident) throws Exception;

    Incident updateIncident(Incident incident) throws Exception;

    void deleteIncident(Long id) throws Exception;

    Incident findIncidentById(Long id) throws Exception;

    List<Incident> findAllIncidents() throws Exception;
}
