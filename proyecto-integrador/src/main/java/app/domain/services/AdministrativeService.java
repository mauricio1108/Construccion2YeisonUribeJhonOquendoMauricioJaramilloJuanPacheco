package app.domain.services;

import org.springframework.stereotype.Service;
import app.domain.model.Appointment;
import app.domain.model.Patient;
import app.domain.ports.AdministrativePort;
import app.domain.validator.PatientValidator;

@Service
public class AdministrativeService {

    private final AdministrativePort administrativePort;
    private final PatientValidator patientValidator;

    public AdministrativeService(AdministrativePort administrativePort, PatientValidator patientValidator) {
        this.administrativePort = administrativePort;
        this.patientValidator = patientValidator;
    }

    public void registerPatient(Patient patient) throws Exception {
        patientValidator.validName(patient.getFullName());
        patientValidator.validDocument(String.valueOf(patient.getIdentificationNumber()));
        patientValidator.validAge(String.valueOf(patient.getBirthDate()));
        patientValidator.validGender(patient.getGender());
        patientValidator.validateResidenceAddress(patient.getAddress());
        patientValidator.validateEmail(patient.getEmail());

        administrativePort.savePatient(patient);
    }

    public void scheduleAppointment(Appointment appointment) throws Exception {
        administrativePort.saveAppointment(appointment);
    }

    public void cancelAppointment(String appointmentId) throws Exception {
        administrativePort.deleteAppointment(appointmentId);
    }

    public Patient findPatientByDocument(String document) throws Exception {
        return administrativePort.findPatientByDocument(document);
    }
}
