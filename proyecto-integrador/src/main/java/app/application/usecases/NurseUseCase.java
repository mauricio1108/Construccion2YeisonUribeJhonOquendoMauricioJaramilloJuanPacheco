package app.application.usecases;


import app.domain.model.NursingRecord;
import app.domain.model.Patient;


public interface NurseUseCase {
	
	void registerNursingRecord(NursingRecord record) throws Exception;

    NursingRecord findRecordById(String recordId) throws Exception;

    void updateNursingRecord(NursingRecord record) throws Exception;

    void deleteNursingRecord(String recordId) throws Exception;

    Patient findPatientByDocument(String document) throws Exception;
}
