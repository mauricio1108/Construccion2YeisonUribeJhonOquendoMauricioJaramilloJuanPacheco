package app.application.usecases;

import app.domain.model.PatientRecord;

public interface DoctorUseCase {
    void createPatientRecord(PatientRecord record) throws Exception;
    PatientRecord findRecordById(String id) throws Exception;
}