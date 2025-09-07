/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.DiagnosticAid;
import app.domain.ports.DiagnosticOrderPort;

public class DiagnosticAidInventoryService {

    private DiagnosticOrderPort diagnosticAidPort;

    public void addDiagnosticAid(DiagnosticAid diagnosticAid) throws Exception {
        if (diagnosticAidPort.findById(diagnosticAid.getId()) != null) {
            throw new IllegalArgumentException("Ya existe una ayuda diagnóstica con este ID.");
        }
        diagnosticAidPort.save(diagnosticAid);
    }

    public void updateDiagnosticAid(DiagnosticAid diagnosticAid) throws Exception {
        if (diagnosticAidPort.findById(diagnosticAid.getId()) == null) {
            throw new IllegalArgumentException("La ayuda diagnóstica a actualizar no existe.");
        }
        diagnosticAidPort.update(diagnosticAid);
    }

    public void deleteDiagnosticAid(String aidId) throws Exception {
        if (diagnosticAidPort.findById(aidId) == null) {
            throw new IllegalArgumentException("La ayuda diagnóstica a eliminar no existe.");
        }
        diagnosticAidPort.delete(aidId);
    }
}
