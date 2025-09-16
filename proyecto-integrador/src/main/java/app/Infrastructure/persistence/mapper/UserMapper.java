package app.infrastructure.persistence.mapper;

import app.domain.model.Role;
import app.domain.model.User;
import app.infrastructure.persistence.entities.UserEntity;

public class UserMapper {

    public static UserEntity toEntity(User user) {
        if (user == null) return null;
        
        UserEntity entity = new UserEntity();
        
        entity.setFullName(user.getFullName());
        entity.setIdentificationNumber(user.getIdentificationNumber());
        entity.setEmail(user.getEmail());
        entity.setPhoneNumber(user.getPhoneNumber());
        entity.setBirthDate(user.getBirthDate());
        entity.setAddress(user.getAddress());
        entity.setRole(user.getRole());
        entity.setUsername(user.getUsername());
        entity.setPasswordHash(user.getPassword());
        return entity;
    }

    public static User toDomain(UserEntity entity) {
        if (entity == null) return null;
        
        User user = new User();
        
        user.setFullName(entity.getFullName());
        user.setIdentificationNumber(entity.getIdentificationNumber());
        user.setEmail(entity.getEmail());
        user.setPhoneNumber(entity.getPhoneNumber());
        user.setBirthDate(entity.getBirthDate());
        user.setAddress(entity.getAddress());
        user.setRole(entity.getRole());
        user.setUsername(entity.getUsername());
        user.setPassword(entity.getPasswordHash());
        return user;
    }
}
