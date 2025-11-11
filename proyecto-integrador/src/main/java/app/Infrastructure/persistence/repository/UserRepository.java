package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // The entity uses 'identificationNumber' and 'username' fields
    UserEntity findByIdentificationNumber(long identificationNumber);

    UserEntity findByUsername(String username);
}