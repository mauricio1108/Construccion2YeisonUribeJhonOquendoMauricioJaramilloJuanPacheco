package app.application.usecases.impl;

import app.application.usecases.NurseUseCase;
import app.domain.model.NursingRecord;
import app.domain.model.Patient;
import app.domain.services.NurseService;
import org.springframework.stereotype.Service;

@Service
public class NurseUseCaseImpl implements NurseUseCase {
    
    private final NurseService nurseService;

    public NurseUseCaseImpl(NurseService nurseService) {
        this.nurseService = nurseService;
    }

    @Override
    public void registerNursingRecord(NursingRecord record) throws Exception {
        nurseService.registerNursingRecord(record);
    }

    @Override
    public NursingRecord findRecordById(String recordId) throws Exception {
        return nurseService.findRecordById(recordId);
    }

    @Override
    public void updateNursingRecord(NursingRecord record) throws Exception {
        nurseService.updateNursingRecord(record);
    }

    @Override
    public void deleteNursingRecord(String recordId) throws Exception {
        nurseService.deleteNursingRecord(recordId);
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        return nurseService.findPatientByDocument(document);
    }
}
