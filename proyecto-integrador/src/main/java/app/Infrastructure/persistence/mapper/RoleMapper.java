package app.Infrastructure.persistence.mapper;

import app.domain.model.Role;
import app.Infrastructure.persistence.entities.RoleEntity;

public class RoleMapper {

        public static RoleEntity toEntity(Role role) {
        if (role == null) return null;
        
        RoleEntity entity = new RoleEntity();
        
        entity.setName(role);
        entity.setDescription(getRoleDescription(role));
        
        return entity;
    }

        public static Role toDomain(RoleEntity entity) {
        if (entity == null) return null;
        
        return entity.getName();
    }
    
        private static String getRoleDescription(Role role) {
        switch (role) {
            case HUMAN_RESOURCES:
                return "Responsable de la gestión de usuarios y permisos";
            case ADMINISTRATIVE_STAFF:
                return "Maneja el registro de pacientes y tareas administrativas";
            case INFORMATION_SUPPORT:
                return "Gestiona la integridad del sistema y soporte técnico";
            case NURSE:
                return "Proporciona atención al paciente y registra signos vitales";
            case DOCTOR:
                return "Diagnostica pacientes y crea registros médicos";
            default:
                return "";
        }
    }
}