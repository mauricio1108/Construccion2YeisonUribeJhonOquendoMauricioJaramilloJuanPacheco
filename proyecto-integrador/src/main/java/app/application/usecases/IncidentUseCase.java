package app.application.usecases;
import java.util.List;

import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

public class IncidentUseCase {
	private final IncidentPort incidentPort;
	
	public IncidentUseCase(IncidentPort incidentPort) {
        this.incidentPort = incidentPort;
    }
	
	public Incident createIncident(Incident incident) throws Exception {
        // Aquí puedes agregar validaciones de negocio antes de guardar
        return incidentPort.createIncident(incident);
    }

    public Incident updateIncident(Incident incident) throws Exception {
        return incidentPort.updateIncident(incident);
    }

    public void deleteIncident(Long id) throws Exception {
        incidentPort.deleteIncident(id);
    }

    public Incident findIncidentById(Long id) throws Exception {
        return incidentPort.findIncidentById(id);
    }

    public List<Incident> findAllIncidents() throws Exception {
        return incidentPort.findAllIncidents();
    }
}
	
	
