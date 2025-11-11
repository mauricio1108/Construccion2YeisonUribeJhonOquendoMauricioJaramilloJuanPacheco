package app.Infrastructure.adapters;

import app.domain.model.User;
import app.domain.ports.UserPort;
import app.Infrastructure.persistence.mapper.UserMapper;
import app.Infrastructure.persistence.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserAdapter implements UserPort {

    private final UserRepository userRepository;

    public UserAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUserName(String user) throws Exception {
        var entity = userRepository.findByUsername(user);
        return UserMapper.toDomain(entity);
    }

    @Override
    public User findByDocument(long document) throws Exception {
        var entity = userRepository.findByIdentificationNumber(document);
        return UserMapper.toDomain(entity);
    }

    @Override
    public void save(User user) throws Exception {
        var entity = UserMapper.toEntity(user);
        userRepository.save(entity);
    }

    @Override
    public void update(User user) throws Exception {
        var entity = UserMapper.toEntity(user);
        userRepository.save(entity);
    }

    @Override
    public void delete(long id) throws Exception {
        userRepository.deleteById(id);
    }
}
