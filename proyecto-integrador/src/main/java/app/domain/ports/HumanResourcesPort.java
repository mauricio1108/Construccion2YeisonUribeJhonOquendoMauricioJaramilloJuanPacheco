package app.domain.ports;

import java.util.List;

import app.domain.model.User;

public interface HumanResourcesPort {
	
	void save(User user);
    void update(User user);
    void delete(String username);
    User findByUsername(String username);
    List<User> findAll();
}
