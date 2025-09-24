package app.domain.ports;

import app.domain.model.Appointment;
import app.domain.model.Patient;

public interface AdministrativePort {
	void savePatient(Patient patient) throws Exception;
    void saveAppointment(Appointment appointment) throws Exception;
    void deleteAppointment(String appointmentId) throws Exception;
    Patient findPatientByDocument(String document) throws Exception;
}
