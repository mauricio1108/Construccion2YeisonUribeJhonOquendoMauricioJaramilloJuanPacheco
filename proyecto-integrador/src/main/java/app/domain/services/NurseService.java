package app.domain.services;

import org.springframework.stereotype.Service;
import app.domain.model.NursingRecord;
import app.domain.model.Patient;
import app.domain.ports.NursePort;

@Service
public class NurseService {

    private final NursePort nursePort;

    public NurseService(NursePort nursePort) {
        this.nursePort = nursePort;
    }

    public void registerNursingRecord(NursingRecord record) throws Exception {
        nursePort.saveRecord(record);
    }

    public NursingRecord findRecordById(String recordId) throws Exception {
        return nursePort.findRecordById(recordId);
    }

    public void updateNursingRecord(NursingRecord record) throws Exception {
        nursePort.updateRecord(record);
    }

    public void deleteNursingRecord(String recordId) throws Exception {
        nursePort.deleteRecord(recordId);
    }

    public Patient findPatientByDocument(String document) throws Exception {
        return nursePort.findPatientByDocument(document);
    }
}
