package app.infrastructure.persistence.mapper;

import app.domain.model.MedicalInsurance;
import app.Infrastructure.persistence.entities.MedicalInsuranceEntity;

public class MedicalInsuranceMapper {

    public static MedicalInsuranceEntity toEntity(MedicalInsurance insurance) {
        if (insurance == null) return null;
        return new MedicalInsuranceEntity(
                insurance.getProvider(),
                insurance.getPolicyNumber()
        );
    }

    public static MedicalInsurance toDomain(MedicalInsuranceEntity entity) {
        if (entity == null) return null;
        return new MedicalInsurance(
                entity.getProvider(),
                entity.getPolicyNumber()
        );
    }
}