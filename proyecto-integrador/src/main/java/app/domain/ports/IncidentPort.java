package app.domain.ports;


import app.domain.model.Incident;


	public interface IncidentPort {
		void saveIncident(Incident incident) throws Exception;
		Incident findIncidentById(Long incidentId) throws Exception;
		void updateIncident(Incident incident) throws Exception;
		void resolveIncident(Long incidentId) throws Exception;
		void deleteIncident(Long incidentId) throws Exception;
	}