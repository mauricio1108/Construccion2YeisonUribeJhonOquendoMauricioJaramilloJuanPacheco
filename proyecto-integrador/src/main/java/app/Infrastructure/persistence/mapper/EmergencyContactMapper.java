package app.Infrastructure.persistence.mapper;

import app.domain.model.EmergencyContact;
import app.Infrastructure.persistence.entities.EmergencyContactEntity;

public class EmergencyContactMapper {

    public static EmergencyContactEntity toEntity(EmergencyContact contact) {
        if (contact == null) return null;
        return new EmergencyContactEntity(
                contact.getName(),
                contact.getPhoneNumber(),
                contact.getRelationship()
        );
    }

    public static EmergencyContact toDomain(EmergencyContactEntity entity) {
        if (entity == null) return null;
        return new EmergencyContact(
                entity.getFullName(),
                entity.getPhoneNumber(),
                entity.getRelationship()
        );
    }
}