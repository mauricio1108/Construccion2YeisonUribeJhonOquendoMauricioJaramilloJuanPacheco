/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.domain.ports;

import app.domain.model.Order;
import java.util.List;

/**
 *
 * @author EXSSjfoquend
 */
public interface OrderPort {
   Order findById(String orderId) throws Exception;
    List<Order> findByPatientId(String patientId) throws Exception;
    void save(Order order) throws Exception; 
}
