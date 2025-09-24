package app.domain.services;

import app.domain.model.User;
import app.domain.ports.UserPort;

public class CreateUser {

    private UserPort userPort;

    public void createUser(User user) throws Exception {
        if (userPort.findByDocument(user.getIdentificationNumber()) != null) {
            throw new IllegalArgumentException("Ya existe un usuario con esta cédula.");
        }
        if (userPort.findByUserName(user.getUsername()) != null) {
            throw new IllegalArgumentException("El nombre de usuario ya existe.");
        }
        if (user.getPassword().length() < 8 || !user.getPassword().matches(".*[A-Z].*") || !user.getPassword().matches(".*\\d.*") || !user.getPassword().matches(".*[^a-zA-Z0-9].*")) {
            throw new IllegalArgumentException("La contraseña no cumple con los requisitos de seguridad.");
        }
        
        userPort.save(user);
    }
}
