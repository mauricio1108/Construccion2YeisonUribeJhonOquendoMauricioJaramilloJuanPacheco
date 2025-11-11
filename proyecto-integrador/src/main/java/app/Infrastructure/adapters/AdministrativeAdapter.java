package app.Infrastructure.adapters;

import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.ports.AdministrativePort;
import app.Infrastructure.persistence.mapper.PatientMapper;
import app.Infrastructure.persistence.repository.PatientRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AdministrativeAdapter implements AdministrativePort {

    private final PatientRepository patientRepository;
    private final Map<String, Appointment> appointments = new HashMap<>();

    public AdministrativeAdapter(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public void savePatient(Patient patient) throws Exception {
        var entity = PatientMapper.toEntity(patient);
        patientRepository.save(entity);
    }

    @Override
    public void saveAppointment(Appointment appointment) throws Exception {
        appointments.put(appointment.getId(), appointment);
    }

    @Override
    public void deleteAppointment(String appointmentId) throws Exception {
        appointments.remove(appointmentId);
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        var entity = patientRepository.findByIdentificationNumber(document);
        return PatientMapper.toDomain(entity);
    }
}
