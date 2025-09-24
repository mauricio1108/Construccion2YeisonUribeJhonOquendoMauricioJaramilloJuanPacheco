package app.Infrastructure.persistence.mapper;

import app.Infrastructure.persistence.entities.MedicalInsuranceEntity;
import app.domain.model.MedicalInsurance;

public class MedicalInsuranceMapper {

    public static MedicalInsuranceEntity toEntity(MedicalInsurance insurance) {
        if (insurance == null) return null;
        
        return new MedicalInsuranceEntity(
            insurance.getCompanyName(),
            insurance.getPolicyNumber(),
            insurance.isActive(),
            insurance.getExpirationDate()
        );
    }

    public static MedicalInsurance toDomain(MedicalInsuranceEntity entity) {
        if (entity == null) return null;
        
        return new MedicalInsurance(
            entity.getCompanyName(),
            entity.getPolicyNumber(),
            entity.isActive(),
            entity.getExpirationDate()
        );
    }
}