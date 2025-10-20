package app.application.usecases;

import java.util.List;

import app.domain.model.User;

public interface HumanResourcesUseCase {
	
	void createUser(User user) throws Exception;
    void updateUser(User user) throws Exception;
    void deleteUser(String username) throws Exception;
    User getUserByUsername(String username) throws Exception;
    List<User> getAllUsers();

}
