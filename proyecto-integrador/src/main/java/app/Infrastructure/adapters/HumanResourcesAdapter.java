package app.Infrastructure.adapters;

import org.springframework.stereotype.Component;
import app.domain.model.User;
import app.domain.ports.HumanResourcesPort;
import java.util.*;

@Component
public class HumanResourcesAdapter implements HumanResourcesPort {
    
    private final Map<String, User> userStorage = new HashMap<>();

    @Override
    public void save(User user) {
        userStorage.put(user.getUsername(), user);
    }

    @Override
    public void update(User user) {
        userStorage.put(user.getUsername(), user);
    }

    @Override
    public void delete(String username) {
        userStorage.remove(username);
    }

    @Override
    public User findByUsername(String username) {
        return userStorage.get(username);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userStorage.values());
    }
}
