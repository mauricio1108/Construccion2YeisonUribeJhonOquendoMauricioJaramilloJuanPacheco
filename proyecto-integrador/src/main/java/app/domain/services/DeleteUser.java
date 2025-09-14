/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.ports.UserPort;


public class DeleteUser {

    private UserPort userPort;

    public void deleteUser(String userId) throws Exception {
        // Lógica de negocio: Verificar si el usuario puede ser eliminado (ej. no tiene registros asociados).
        if (userPort.findByDocument(userId) == null) {
            throw new IllegalArgumentException("El usuario que intenta eliminar no existe.");
        }
        userPort.delete(userId);
    }
}