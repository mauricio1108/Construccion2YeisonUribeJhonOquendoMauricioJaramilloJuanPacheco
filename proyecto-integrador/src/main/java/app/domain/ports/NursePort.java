package app.domain.ports;

import app.domain.model.NursingRecord;
import app.domain.model.Patient;

public interface NursePort {
	
	void saveRecord(NursingRecord record) throws Exception;

    NursingRecord findRecordById(String recordId) throws Exception;

    void updateRecord(NursingRecord record) throws Exception;

    void deleteRecord(String recordId) throws Exception;

    Patient findPatientByDocument(String document) throws Exception;
}
