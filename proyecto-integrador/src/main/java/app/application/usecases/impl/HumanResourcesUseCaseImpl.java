package app.application.usecases.impl;

import java.util.List;

import app.application.usecases.HumanResourcesUseCase;
import app.domain.model.User;
import app.domain.ports.HumanResourcesPort;

public class HumanResourcesUseCaseImpl  implements HumanResourcesUseCase {
	
	private final HumanResourcesPort humanResourcesPort;

    public HumanResourcesUseCaseImpl(HumanResourcesPort humanResourcesPort) {
        this.humanResourcesPort = humanResourcesPort;
    }

    @Override
    public void createUser(User user) throws Exception {
        validateUser(user);
        humanResourcesPort.save(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        validateUser(user);
        humanResourcesPort.update(user);
    }

    @Override
    public void deleteUser(String username) throws Exception {
        humanResourcesPort.delete(username);
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return humanResourcesPort.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return humanResourcesPort.findAll();
    }

    private void validateUser(User user) throws Exception {
        if (!user.getUsername().matches("^[a-zA-Z0-9]{1,15}$")) {
            throw new Exception("El nombre de usuario debe ser alfanumérico y máximo de 15 caracteres.");
        }

        if (!user.getEmail().matches("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}$")) {
            throw new Exception("Correo electrónico no válido.");
        }

        if (!user.getPassword().matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$")) {
            throw new Exception("La contraseña debe tener al menos una mayúscula, un número, un carácter especial y mínimo 8 caracteres.");
        }
    }
}
