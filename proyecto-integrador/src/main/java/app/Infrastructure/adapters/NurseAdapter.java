package app.Infrastructure.adapters;


import app.domain.model.NursingRecord;
import app.domain.model.Patient;
import app.domain.ports.NursePort;


public class NurseAdapter implements NursePort  {
	
	@Override
    public void saveRecord(NursingRecord record) throws Exception {
        
        System.out.println("Guardando registro de enfermería: " + record);
    }

    @Override
    public NursingRecord findRecordById(String recordId) throws Exception {
        
        System.out.println("Buscando registro de enfermería con ID: " + recordId);
        return null; // 
    }

    @Override
    public void updateRecord(NursingRecord record) throws Exception {
        
        System.out.println("Actualizando registro de enfermería: " + record);
    }

    @Override
    public void deleteRecord(String recordId) throws Exception {
        
        System.out.println("Eliminando registro de enfermería con ID: " + recordId);
    }

    @Override
    public Patient findPatientByDocument(String document) throws Exception {
        
        System.out.println("Buscando paciente con documento: " + document);
        return null; 
    }
}
