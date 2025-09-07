package app.domain.services;

import app.domain.model.Invoice;
import app.domain.model.Patient;
import app.domain.model.Order;
import app.domain.model.MedicalInsurance;
import app.domain.model.User;
import app.domain.ports.InvoicePort;
import app.domain.ports.OrderPort;

import java.util.List;

public class CreateInvoice {
    
    private InvoicePort invoicePort;

    private static final double COPAGO = 50000.0;
    private static final double COPAGO_LIMIT = 1000000.0;
    
    public void createInvoice(Patient patient, List<Order> orders, User doctor) throws Exception {
        double totalCost = calculateTotalCost(orders);
        double patientPayment = 0.0;
        double insurancePayment = 0.0;
        
        MedicalInsurance insurance = patient.getMedicalInsurance();
        boolean hasActivePolicy = insurance != null && insurance.isPolicyStatus();

        if (hasActivePolicy) {
            double annualCopago = getAnnualCopago(patient);

            if (annualCopago >= COPAGO_LIMIT) {
                insurancePayment = totalCost;
            } else {
                patientPayment = COPAGO;
                insurancePayment = totalCost - COPAGO;
            }
        } else {
            patientPayment = totalCost;
        }

        // El constructor ha sido reemplazado por la creación del objeto y el uso de setters
        Invoice invoice = new Invoice();
        invoice.setPatient(patient);
        invoice.setTreatingDoctor(doctor);
        invoice.setTotalCost(totalCost);
        invoice.setPatientPayment(patientPayment);
        invoice.setInsurancePayment(insurancePayment);
        
        invoicePort.save(invoice);
    }

    private double calculateTotalCost(List<Order> orders) {
        double total = 0.0;
        return total;
    }

    private double getAnnualCopago(Patient patient) throws Exception {
        // Lógica para obtener el copago anual del paciente.
        return 0.0;
    }
}