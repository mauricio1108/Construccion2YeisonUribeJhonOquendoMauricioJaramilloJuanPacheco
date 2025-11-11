package app.Infrastructure.adapters;

import app.domain.model.Invoice;
import app.domain.ports.InvoicePort;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InvoiceAdapter implements InvoicePort {

    private final Map<String, Invoice> storage = new HashMap<>();

    @Override
    public Invoice findById(String invoiceId) throws Exception {
        return storage.get(invoiceId);
    }

    @Override
    public List<Invoice> findByPatientId(String patientId) throws Exception {
        var list = new ArrayList<Invoice>();
        for (Invoice inv : storage.values()) {
            if (inv != null && inv.getPatient() != null && patientId.equals(inv.getPatient().getIdentificationNumber())) list.add(inv);
        }
        return list;
    }

    @Override
    public void save(Invoice invoice) throws Exception {
        // Invoice model doesn't include an id. We generate an internal id to store invoices.
        var id = java.util.UUID.randomUUID().toString();
        storage.put(id, invoice);
    }
}
