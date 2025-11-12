package app.domain.services;

import app.domain.model.Patient;
import app.domain.model.valueobjects.ValueObjectValidator;
import app.domain.ports.PatientPort;

public class CreatePatient {

    private PatientPort patientPort;

    public void createPatient(Patient patient) throws Exception {
        try {

            if (patientPort.findById(patient.getIdentificationNumber()) != null) {
                throw new IllegalArgumentException("Ya existe un paciente con esta identificación.");
            }

        } catch (RuntimeException e) {
            throw new Exception(e.getCause().getMessage()); // Compatible con tu signature
        }

    }
}
