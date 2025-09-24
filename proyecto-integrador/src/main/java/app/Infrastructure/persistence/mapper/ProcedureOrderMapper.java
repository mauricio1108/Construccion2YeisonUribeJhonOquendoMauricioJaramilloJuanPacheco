package app.Infrastructure.persistence.mapper;

import app.Infrastructure.persistence.entities.ProcedureOrderEntity;
import app.domain.model.ProcedureOrder;

public class ProcedureOrderMapper {

    public static ProcedureOrderEntity toEntity(ProcedureOrder procedureOrder) {
        if (procedureOrder == null) return null;

        ProcedureOrderEntity entity = new ProcedureOrderEntity();
       // entity.setId(procedureOrder.getId());
        entity.setProcedureName(procedureOrder.getProcedureName());
        //entity.setDescription(procedureOrder.getDescription());

        // La relación con OrderEntity se asigna en OrderMapper
        return entity;
    }

    public static ProcedureOrder toDomain(ProcedureOrderEntity entity) {
        if (entity == null) return null;

      /*  ProcedureOrder procedureOrder = new ProcedureOrder();
        procedureOrder.setId(entity.getId());
        procedureOrder.setProcedureName(entity.getProcedureName());
        procedureOrder.setDescription(entity.getDescription());*/

        // La relación con Order se asigna en OrderMapper
        return null;
    }
}