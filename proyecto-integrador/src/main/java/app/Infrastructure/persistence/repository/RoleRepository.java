package app.Infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.Infrastructure.persistence.entities.RoleEntity;
import app.domain.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    // RoleEntity.name is an enum of type Role
    RoleEntity findByName(Role name);
}