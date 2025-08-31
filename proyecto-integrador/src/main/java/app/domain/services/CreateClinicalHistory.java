/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.DiagnosticAidOrder;
import app.domain.model.ClinicalHistory;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Role;
import app.domain.ports.DiagnosticOrderPort;
import app.domain.ports.ClinicalHistoryPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreateClinicalHistory {
    private UserPort userPort;
    private PatientPort patientPort;
    private DiagnosticOrderPort diagnosticOrderPort;
    private ClinicalHistoryPort clinicalHistoryPort;

    public void create(ClinicalHistory clinicalHistory) throws Exception{
        Patient patient = patientPort.findById(clinicalHistory.getPatient());
        if(patient == null) {
                throw new Exception("la historia debe tener un pasitente valido");
        }
        User doctor = userPort.findByDocument(clinicalHistory.getDoctor());
        if(doctor==null || !doctor.getRole().equals(Role.DOCTOR)) {
                throw new Exception("la historia clinica debe ser registrada por un doctor valido");
        }
        DiagnosticAidOrder diagnosticOrder = diagnosticOrderPort.findById(clinicalHistory.getDiagnosticOrder());
        if(diagnosticOrder==null) {
                throw new Exception("la historia clinica debe tener una orden valida asociada");
        }
        clinicalHistory.setPatient(patient);
        clinicalHistory.setDoctor(doctor);
        clinicalHistory.setDiagnosticOrder(diagnosticOrder);
        clinicalHistoryPort.save(clinicalHistory);

    }
}
