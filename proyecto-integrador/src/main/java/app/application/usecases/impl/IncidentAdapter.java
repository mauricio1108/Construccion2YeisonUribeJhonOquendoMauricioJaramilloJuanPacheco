package app.application.usecases.impl;
import app.domain.model.Incident;
import app.domain.ports.IncidentPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IncidentAdapter implements IncidentPort {
	
	private final List<Incident> incidents = new ArrayList<>();

    @Override
    public Incident createIncident(Incident incident) {
        incidents.add(incident);
        return incident;
    }

    @Override
    public Incident updateIncident(Incident incident) {
        Optional<Incident> existing = incidents.stream()
                .filter(i -> i.getId().equals(incident.getId()))
                .findFirst();

        if (existing.isPresent()) {
            incidents.remove(existing.get());
            incidents.add(incident);
            return incident;
        }
        throw new RuntimeException("Incident not found with id " + incident.getId());
    }

    @Override
    public void deleteIncident(Long id) {
        incidents.removeIf(i -> i.getId().equals(id));
    }

    @Override
    public Incident findIncidentById(Long id) {
        return incidents.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Incident not found with id " + id));
    }

    @Override
    public List<Incident> findAllIncidents() {
        return new ArrayList<>(incidents);
    }
	
}
