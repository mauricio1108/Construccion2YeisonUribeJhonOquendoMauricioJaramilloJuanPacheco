package app.application.usecases;

import app.domain.model.Incident;
import app.domain.model.PatientRecord;

public interface IncidentUseCase {
	
	    void createPatientRecord(PatientRecord record) throws Exception;
		PatientRecord findPatientRecordById(Long id) throws Exception;
		}