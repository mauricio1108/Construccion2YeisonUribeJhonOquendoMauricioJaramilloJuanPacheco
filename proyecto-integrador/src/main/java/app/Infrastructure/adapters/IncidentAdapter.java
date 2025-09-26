package app.Infrastructure.adapters;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IncidentAdapter implements IncidentPort {
	
	 @Override
	    public void saveIncident(Incident incident) throws Exception {
	        System.out.println("Guardando incidente: " + incident);
	    }

	    @Override
	    public Incident findIncidentById(String incidentId) throws Exception {
	        System.out.println("Buscando incidente con ID: " + incidentId);
	        return null; 
	    }

	    @Override
	    public void updateIncident(Incident incident) throws Exception {
	        System.out.println("Actualizando incidente: " + incident);
	    }

	    @Override
	    public void resolveIncident(String incidentId) throws Exception {
	        System.out.println("Marcando incidente como resuelto: " + incidentId);
	    }

	    @Override
	    public void deleteIncident(String incidentId) throws Exception {
	        System.out.println("Eliminando incidente con ID: " + incidentId);
	    }
	}
