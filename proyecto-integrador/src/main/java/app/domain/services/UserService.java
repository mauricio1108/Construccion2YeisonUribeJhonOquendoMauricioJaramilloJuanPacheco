package app.domain.services;

import app.domain.model.User;
import app.domain.ports.HumanResourcesPort;
import java.util.List;

/**
 * User service facade used by application use-cases. Delegates to HumanResourcesPort for persistence
 * and keeps basic business validations in one place.
 */
public class UserService {

    private final HumanResourcesPort hrPort;

    public UserService(HumanResourcesPort hrPort) {
        this.hrPort = hrPort;
    }

    public void createUser(User user) throws Exception {
        // Basic business rules
        if (hrPort.findByUsername(user.getUsername()) != null) {
            throw new IllegalArgumentException("El nombre de usuario ya existe.");
        }
        // Delegate persist
        hrPort.save(user);
    }

    public void updateUser(User user) throws Exception {
        if (hrPort.findByUsername(user.getUsername()) == null) {
            throw new IllegalArgumentException("El usuario a actualizar no existe.");
        }
        hrPort.update(user);
    }

    public void deleteUser(String username) throws Exception {
        hrPort.delete(username);
    }

    public User findByUsername(String username) throws Exception {
        return hrPort.findByUsername(username);
    }

    public List<User> findAll() throws Exception {
        return hrPort.findAll();
    }
}
