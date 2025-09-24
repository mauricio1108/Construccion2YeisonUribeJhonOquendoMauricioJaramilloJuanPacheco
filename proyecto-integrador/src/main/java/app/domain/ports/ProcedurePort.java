/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.domain.ports;

import app.domain.model.Procedure;

/**
 *
 * @author EXSSjfoquend
 */
public interface ProcedurePort {
    Procedure findById(String procedureId) throws Exception;
    void save(Procedure procedure) throws Exception;
    void update(Procedure procedure) throws Exception;
    void delete(String procedureId) throws Exception;
}
