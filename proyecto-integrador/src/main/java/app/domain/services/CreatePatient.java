
package app.domain.services;

import app.domain.model.Patient;
import app.domain.ports.PatientPort;

public class CreatePatient {

    private PatientPort patientPort;

    public void createPatient(Patient patient) throws Exception {
        if (patientPort.findById(patient.getIdentificationNumber()) != null) {
            throw new IllegalArgumentException("Ya existe un paciente con esta identificación.");
        }
        
        if (patient.getPhoneNumber().length() != 10) {
            throw new IllegalArgumentException("El número de teléfono debe contener 10 dígitos.");
        }

        patientPort.save(patient);
    }
}
