package app.application.usecases.impl;

import java.util.List;

import app.application.usecases.HumanResourcesUseCase;
import app.domain.model.User;
import app.domain.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class HumanResourcesUseCaseImpl  implements HumanResourcesUseCase {
    
    private final UserService userService;

    public HumanResourcesUseCaseImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void createUser(User user) throws Exception {
        userService.createUser(user);
    }

    @Override
    public void updateUser(User user) throws Exception {
        userService.updateUser(user);
    }

    @Override
    public void deleteUser(String username) throws Exception {
        userService.deleteUser(username);
    }

    @Override
    public User getUserByUsername(String username) throws Exception {
        return userService.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        try {
            return userService.findAll();
        } catch (Exception e) {
            return java.util.Collections.emptyList();
        }
    }
}
