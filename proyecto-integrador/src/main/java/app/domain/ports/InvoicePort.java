package app.domain.ports;

import app.domain.model.Invoice;
import java.util.List;

public interface InvoicePort {
    Invoice findById(String invoiceId) throws Exception;
    List<Invoice> findByPatientId(String patientId) throws Exception;
    void save(Invoice invoice) throws Exception;
}