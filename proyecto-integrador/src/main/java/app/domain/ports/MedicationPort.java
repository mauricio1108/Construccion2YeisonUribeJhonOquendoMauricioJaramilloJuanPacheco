/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.domain.ports;

import app.domain.model.Medication;

/**
 *
 * @author EXSSjfoquend
 */
public interface MedicationPort {
    Medication findById(String medicationId) throws Exception;
    void save(Medication medication) throws Exception;
    void update(Medication medication) throws Exception;
    void delete(String medicationId) throws Exception; 
}
