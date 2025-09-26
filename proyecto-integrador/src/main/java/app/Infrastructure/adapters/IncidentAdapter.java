package app.Infrastructure.adapters;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;


public class IncidentAdapter implements IncidentPort {
	
	 @Override
	    public void saveIncident(Incident incident) throws Exception {
	        System.out.println("Guardando incidente: " + incident);
	    }

	    @Override
	    public Incident findIncidentById(Long incidentId) throws Exception {
	        System.out.println("Buscando incidente con ID: " + incidentId);
	        return null; 
	    }

	    @Override
	    public void updateIncident(Incident incident) throws Exception {
	        System.out.println("Actualizando incidente: " + incident);
	    }

	    @Override
	    public void resolveIncident(Long incidentId) throws Exception {
	        System.out.println("Marcando incidente como resuelto: " + incidentId);
	    }

	    @Override
	    public void deleteIncident(Long incidentId) throws Exception {
	        System.out.println("Eliminando incidente con ID: " + incidentId);
	    }
	}
