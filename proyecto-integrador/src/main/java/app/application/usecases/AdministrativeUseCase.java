package app.application.usecases;

import app.domain.model.Appointment;
import app.domain.model.Patient;

public interface AdministrativeUseCase {

    void registerPatient(Patient patient) throws Exception;

    void scheduleAppointment(Appointment appointment) throws Exception;

    void cancelAppointment(String appointmentId) throws Exception;

    Patient findPatientByDocument(String document) throws Exception;

}
