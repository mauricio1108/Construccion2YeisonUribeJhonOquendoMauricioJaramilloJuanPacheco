
package app.domain.services;

import app.domain.model.ClinicalRecord;
import app.domain.ports.ClinicalHistoryPort;
import app.domain.ports.PatientPort;

import java.util.List;

public class SearchClinicalHistoryByPatient {

    private ClinicalHistoryPort clinicalHistoryPort;
    private PatientPort patientPort;

    public List<ClinicalRecord> searchByPatientId(String patientId) throws Exception {
        if (patientPort.findById(patientId) == null) {
            throw new IllegalArgumentException("No se puede buscar la historia clínica de un paciente que no existe.");
        }
        
        return clinicalHistoryPort.findByPatientId(patientId);
    }
}