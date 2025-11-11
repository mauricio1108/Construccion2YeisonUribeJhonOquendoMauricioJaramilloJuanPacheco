package app.Infrastructure.adapters;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;
import app.Infrastructure.persistence.mapper.PatientMapper;
import app.Infrastructure.persistence.repository.PatientRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PatientAdapter implements PatientPort {

    private final PatientRepository patientRepository;

    public PatientAdapter(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient findById(String id) throws Exception {
        var entity = patientRepository.findByIdentificationNumber(id);
        return PatientMapper.toDomain(entity);
    }

    @Override
    public List<Patient> findAll() throws Exception {
        return patientRepository.findAll().stream()
                .map(PatientMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Patient patient) throws Exception {
        var entity = PatientMapper.toEntity(patient);
        patientRepository.save(entity);
    }

    @Override
    public void update(Patient patient) throws Exception {
        var entity = PatientMapper.toEntity(patient);
        patientRepository.save(entity);
    }

    @Override
    public void delete(String id) throws Exception {
        var entity = patientRepository.findByIdentificationNumber(id);
        if (entity != null) patientRepository.delete(entity);
    }
}
