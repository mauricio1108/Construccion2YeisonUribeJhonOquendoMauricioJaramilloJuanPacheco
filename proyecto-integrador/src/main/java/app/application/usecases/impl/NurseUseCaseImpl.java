package app.application.usecases.impl;

import app.application.usecases.NurseUseCase;
import app.domain.model.NursingRecord;
import app.domain.model.Patient;
import app.domain.ports.NursePort;

public class NurseUseCaseImpl implements NurseUseCase {
	
	private final NursePort nursePort;

    public NurseUseCaseImpl(NursePort nursePort) {
        this.nursePort = nursePort;
    }

    @Override
    public void registerNursingRecord(NursingRecord record) throws Exception {
        nursePort.saveRecord(record);
    }

    @Override
    public NursingRecord findRecordById(String recordId) throws Exception {
        return nursePort.findRecordById(recordId);
    }

    @Override
    public void updateNursingRecord(NursingRecord record) throws Exception {
        nursePort.updateRecord(record);
    }

    @Override
    public void deleteNursingRecord(String recordId) throws Exception {
        nursePort.deleteRecord(recordId);
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        return nursePort.findPatientByDocument(document);
    }
}
