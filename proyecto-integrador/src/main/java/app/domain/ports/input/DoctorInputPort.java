package app.domain.ports.input;



import app.domain.model.PatientRecord;



public interface DoctorInputPort {

    /**
     * Crea un nuevo registro de paciente.
     */
    void createPatientRecord(PatientRecord record) throws Exception;

    /**
     * Obtiene un registro de paciente por su identificador.
     */
    PatientRecord getPatientRecordById(String id) throws Exception;
}
