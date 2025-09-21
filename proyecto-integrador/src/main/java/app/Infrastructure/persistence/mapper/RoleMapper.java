package app.Infrastructure.persistence.mapper;

import app.domain.model.Role;
import app.Infrastructure.persistence.entities.RoleEntity;

public class RoleMapper {

    public static RoleEntity toEntity(Role role) {
        if (role == null) return null;
        
        RoleEntity entity = new RoleEntity();
        entity.setName(role);
        // Podemos setear una descripción por defecto basada en el rol
        entity.setDescription(getRoleDescription(role));
        return entity;
    }

    public static Role toDomain(RoleEntity entity) {
        if (entity == null) return null;
        
        return entity.getName(); // Directamente devolvemos el enum Role
    }
    
    private static String getRoleDescription(Role role) {
        switch (role) {
            case HUMAN_RESOURCES:
                return "Responsible for user management and permissions";
            case ADMINISTRATIVE_STAFF:
                return "Handles patient registration and administrative tasks";
            case INFORMATION_SUPPORT:
                return "Manages system integrity and technical support";
            case NURSE:
                return "Provides patient care and records vital signs";
            case DOCTOR:
                return "Diagnoses patients and creates medical records";
            default:
                return "";
        }
    }
}