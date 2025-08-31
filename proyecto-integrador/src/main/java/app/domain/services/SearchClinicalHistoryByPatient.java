/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;


import java.util.List;

import app.domain.model.ClinicalHistory;
import app.domain.model.Patient;
import app.domain.ports.ClinicalHistoryPort;
import app.domain.ports.PatientPort;

public class SearchClinicalHistoryByPatient {
    private PatientPort patientPort;
    private ClinicalHistoryPort clinicalHistoryPort;
	
    public List<ClinicalHistory> search(Patient patient) throws Exception{
            patient = patientPort.findById(patient);
            if(patient == null) {
                    throw new Exception("no existe la mascota buscada");
            }
            return clinicalHistoryPort.findByPatient(patient);

    }
}
