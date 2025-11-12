package app.application.usecases.impl;

import app.application.usecases.AdministrativeUseCase;
import app.domain.model.Appointment;
import app.domain.model.Patient;
// imports cleaned: AdministrativeService is injected instead of raw port/validator
import org.springframework.stereotype.Service;

@Service
public class AdministrativeUseCaseImpl implements AdministrativeUseCase {

    private final app.domain.services.AdministrativeService administrativeService;

    //Inyección por constructor
    public AdministrativeUseCaseImpl(app.domain.services.AdministrativeService administrativeService) {
        this.administrativeService = administrativeService;
    }

    @Override
    public void registerPatient(Patient patient) throws Exception {
        administrativeService.registerPatient(patient);
        System.out.println("Paciente registrado correctamente.");
    }

    @Override
    public void scheduleAppointment(Appointment appointment) throws Exception {
        administrativeService.scheduleAppointment(appointment);
        System.out.println("Cita programada correctamente.");
    }

    @Override
    public void cancelAppointment(String appointmentId) throws Exception {
        administrativeService.cancelAppointment(appointmentId);
        System.out.println("Cita cancelada correctamente.");
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        return administrativeService.findPatientByDocument(document);
    }
}