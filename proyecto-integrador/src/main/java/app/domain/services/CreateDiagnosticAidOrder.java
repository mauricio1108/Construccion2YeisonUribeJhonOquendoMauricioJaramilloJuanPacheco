
package app.domain.services;


import app.domain.model.DiagnosticAidOrder;
import app.domain.model.Patient;
import app.domain.model.User;
import app.domain.model.Role;
import app.domain.ports.DiagnosticOrderPort;
import app.domain.ports.PatientPort;
import app.domain.ports.UserPort;

public class CreateDiagnosticAidOrder {
    private UserPort userPort;
    private PatientPort patientPort;
    private DiagnosticOrderPort diagnosticOrderPort;

    public void create(DiagnosticAidOrder diagnosticOrder) throws Exception {
            User doctor = userPort.findByDocument(diagnosticOrder.getDoctor());
            if (doctor == null || !doctor.getRole().equals(Role.DOCTOR)) {
                    throw new Exception("Las ordenes solo las pueden crear los doctores");
            }
                Patient patient = patientPort.findById(diagnosticOrder.getPatient());
            if (patient == null) {
                    throw new Exception("las ordenes se deben aplicar a mascotas registradas");
            }

            diagnosticOrder.setPatient(patient);
            diagnosticOrder.setDoctor(doctor);

            diagnosticOrderPort.save(diagnosticOrder);
    }
    
}
