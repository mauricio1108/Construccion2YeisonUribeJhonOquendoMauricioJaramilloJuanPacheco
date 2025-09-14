/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.Procedure;
import app.domain.ports.ProcedurePort;

public class ProcedureInventoryService {

    private ProcedurePort procedurePort;

    public void addProcedure(Procedure procedure) throws Exception {
        if (procedurePort.findById(procedure.getId()) != null) {
            throw new IllegalArgumentException("Ya existe un procedimiento con este ID.");
        }
        procedurePort.save(procedure);
    }

    public void updateProcedure(Procedure procedure) throws Exception {
        if (procedurePort.findById(procedure.getId()) == null) {
            throw new IllegalArgumentException("El procedimiento a actualizar no existe.");
        }
        procedurePort.update(procedure);
    }

    public void deleteProcedure(String procedureId) throws Exception {
        if (procedurePort.findById(procedureId) == null) {
            throw new IllegalArgumentException("El procedimiento a eliminar no existe.");
        }
        procedurePort.delete(procedureId);
    }
}
