package app.application.usecases.impl;

import app.application.usecases.AdministrativeUseCase;
import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.ports.AdministrativePort;
import app.domain.validator.PatientValidator;
import org.springframework.stereotype.Service;

@Service
public class AdministrativeUseCaseImpl implements AdministrativeUseCase {

    private final AdministrativePort administrativePort;
    private final PatientValidator patientValidator;

    //Inyección por constructor
    public AdministrativeUseCaseImpl(AdministrativePort administrativePort, PatientValidator patientValidator) {
        this.administrativePort = administrativePort;
        this.patientValidator = patientValidator;
    }

    @Override
    public void registerPatient(Patient patient) throws Exception {
        // ✅ Validaciones antes de guardar
        patientValidator.validName(patient.getFullName());
        patientValidator.validDocument(String.valueOf(patient.getIdentificationNumber()));
        patientValidator.validAge(String.valueOf(patient.getBirthDate()));
        patientValidator.validGender(patient.getGender());
        patientValidator.validateResidenceAddress(patient.getAddress());
        patientValidator.validateEmail(patient.getEmail());

        // Si todas las validaciones pasan, se guarda el paciente
        administrativePort.savePatient(patient);
        System.out.println("Paciente registrado correctamente.");
    }

    @Override
    public void scheduleAppointment(Appointment appointment) throws Exception {
        administrativePort.saveAppointment(appointment);
        System.out.println("Cita programada correctamente.");
    }

    @Override
    public void cancelAppointment(String appointmentId) throws Exception {
        administrativePort.deleteAppointment(appointmentId);
        System.out.println("Cita cancelada correctamente.");
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        return administrativePort.findPatientByDocument(document);
    }
}