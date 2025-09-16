package app.domain.services;

import app.domain.ports.UserPort;


public class DeleteUser {

    private UserPort userPort;

    public void deleteUser(long userId) throws Exception {
        // Lógica de negocio: Verificar si el usuario puede ser eliminado (ej. no tiene registros asociados).
        if (userPort.findByDocument(userId) == null) {
            throw new IllegalArgumentException("El usuario que intenta eliminar no existe.");
        }
        userPort.delete(userId);
    }
}