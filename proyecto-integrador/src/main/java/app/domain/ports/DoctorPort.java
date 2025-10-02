package app.domain.ports;

import app.domain.model.PatientRecord;


public interface DoctorPort {
    void saveRecord(PatientRecord record) throws Exception;
    PatientRecord findRecordById(String id) throws Exception;
}