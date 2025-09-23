package app.infrastructure.persistence.mapper;

import app.domain.model.DiagnosticAidOrder;
import app.infrastructure.persistence.entities.DiagnosticAidOrderEntity;

public class DiagnosticAidOrderMapper {

    public static DiagnosticAidOrderEntity toEntity(DiagnosticAidOrder diagnosticAidOrder) {
        if (diagnosticAidOrder == null) return null;

        DiagnosticAidOrderEntity entity = new DiagnosticAidOrderEntity();
      //  entity.setId(diagnosticAidOrder.getId());
       // entity.setAidName(diagnosticAidOrder.getAidName());
        //entity.setDescription(diagnosticAidOrder.getDescription());

        // La relación con OrderEntity se asigna en OrderMapper
        return entity;
    }

    public static DiagnosticAidOrder toDomain(DiagnosticAidOrderEntity entity) {
        if (entity == null) return null;

        //DiagnosticAidOrder diagnosticAidOrder = new DiagnosticAidOrder();
       // diagnosticAidOrder.setId(entity.getId());
        //diagnosticAidOrder.setAidName(entity.getAidName());
        //diagnosticAidOrder.setDescription(entity.getDescription());

        // La relación con Order se asigna en OrderMapper
        return null;
    }
}
