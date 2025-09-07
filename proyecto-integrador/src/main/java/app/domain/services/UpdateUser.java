/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class UpdateUser {

    private UserPort userPort;

    public void updateUser(User user) throws Exception {
        // Lógica de negocio: Verificar que el usuario exista antes de actualizarlo.
        if (userPort.findByDocument(user.getIdentificationNumber()) == null) {
            throw new IllegalArgumentException("El usuario a actualizar no existe.");
        }
        userPort.update(user);
    }
}
