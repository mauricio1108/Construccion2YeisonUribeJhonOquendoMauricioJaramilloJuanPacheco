package app.application.usecases.impl;

import app.application.usecases.AdministrativeUseCase;
import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.ports.AdministrativePort;
import org.springframework.stereotype.Service;


@Service
public class AdministrativeUseCaseImpl implements AdministrativeUseCase {

    private final AdministrativePort administrativePort;

    // Inyección por constructor
    public AdministrativeUseCaseImpl(AdministrativePort administrativePort) {
        this.administrativePort = administrativePort;
    }

    @Override
    public void registerPatient(Patient patient) throws Exception {
        administrativePort.savePatient(patient);
    }

    @Override
    public void scheduleAppointment(Appointment appointment) throws Exception {
        administrativePort.saveAppointment(appointment);
    }

    @Override
    public void cancelAppointment(String appointmentId) throws Exception {
        administrativePort.deleteAppointment(appointmentId);
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        return administrativePort.findPatientByDocument(document);
    }
}
