package app.domain.services;

import app.domain.model.DiagnosticAidOrder;
import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.ports.DiagnosticOrderPort;
import app.domain.ports.InvoicePort;
import app.domain.ports.PatientPort;

public class CreateInvoice {

    private PatientPort patientPort;
    private DiagnosticAidOrder diagnosticAidOrderPort;
    private InvoicePort invoicePort;

    public void create(Invoice invoice) throws Exception {
        Patient patient = patientPort.findById(invoice.getPatient());
        if (patient == null) {
            throw new Exception("la factura debe tener un paciente  asociada");
        }
        if (invoice.isMedicine()) {
            DiagnosticAidOrder diagnosticAidOrder = diagnosticAidOrderPort.findById(invoice.getOrder());
            if (diagnosticAidOrder == null || patient.getIdentificationNumber()!= diagnosticAidOrder.getPatient().getIdentificationNumber()) {
                throw new Exception("la venta de un medicamento requiere de una orden asociada");
            }
            invoice.setOrder(diagnosticAidOrder);
        }
        invoice.setPatient(patient);
        //invoice.setPatientAge(patient.getBirthDate());
        invoicePort.save(invoice);
    }
}