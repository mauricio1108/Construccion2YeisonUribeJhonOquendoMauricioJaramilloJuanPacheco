package app.application.usecases.impl;

import app.application.usecases.DoctorUseCase;

import app.domain.model.PatientRecord;
import app.domain.ports.DoctorPort;


public class DoctorUseCaseImpl implements DoctorUseCase {

    private final DoctorPort doctorPort;

    public DoctorUseCaseImpl(DoctorPort doctorPort) {
        this.doctorPort = doctorPort;
    }

    @Override
    public void createPatientRecord(PatientRecord record) throws Exception {
        doctorPort.saveRecord(record);
    }

    @Override
    public PatientRecord findRecordById(String id) throws Exception {
        return doctorPort.findRecordById(id);
    }
}