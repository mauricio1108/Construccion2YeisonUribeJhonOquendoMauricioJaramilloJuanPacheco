package app.domain.services;

import app.domain.model.ClinicalRecord;
import app.domain.ports.ClinicalHistoryPort;
import app.domain.ports.PatientPort;


public class CreateClinicalHistory {

    private ClinicalHistoryPort clinicalHistoryPort;
    private PatientPort patientPort;

    public void createRecord(String patientId, ClinicalRecord record) throws Exception {
        if (patientPort.findById(patientId) == null) {
            throw new IllegalArgumentException("No se puede crear un registro clínico para un paciente que no existe.");
        }
        
        clinicalHistoryPort.save(patientId, record);
    }
}
