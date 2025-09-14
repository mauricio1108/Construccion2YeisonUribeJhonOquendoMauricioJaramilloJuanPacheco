/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.Medication;
import app.domain.ports.MedicationPort;


public class MedicationInventoryService {

    private MedicationPort medicationPort;

    public void addMedication(Medication medication) throws Exception {
        // Lógica de validación antes de agregar.
        if (medicationPort.findById(medication.getId()) != null) {
            throw new IllegalArgumentException("Ya existe un medicamento con este ID.");
        }
        medicationPort.save(medication);
    }

    public void updateMedication(Medication medication) throws Exception {
        if (medicationPort.findById(medication.getId()) == null) {
            throw new IllegalArgumentException("El medicamento a actualizar no existe.");
        }
        medicationPort.update(medication);
    }

    public void deleteMedication(String medicationId) throws Exception {
        if (medicationPort.findById(medicationId) == null) {
            throw new IllegalArgumentException("El medicamento a eliminar no existe.");
        }
        medicationPort.delete(medicationId);
    }
}