package app.infrastructure.persistence.mapper;

import app.domain.model.MedicationOrder;
import app.infrastructure.persistence.entities.MedicationOrderEntity;

public class MedicationOrderMapper {

    public static MedicationOrderEntity toEntity(MedicationOrder medicationOrder) {
        if (medicationOrder == null) return null;

        MedicationOrderEntity entity = new MedicationOrderEntity();
        entity.setId(medicationOrder.getId());
        entity.setMedicationName(medicationOrder.getMedicationName());
        entity.setDosage(medicationOrder.getDosage());
        entity.setFrequency(medicationOrder.getFrequency());
        entity.setDuration(medicationOrder.getDuration());

        // La relación con OrderEntity se asigna desde OrderMapper
        return entity;
    }

    public static MedicationOrder toDomain(MedicationOrderEntity entity) {
        if (entity == null) return null;

        MedicationOrder medicationOrder = new MedicationOrder();
        medicationOrder.setId(entity.getId());
        medicationOrder.setMedicationName(entity.getMedicationName());
        medicationOrder.setDosage(entity.getDosage());
        medicationOrder.setFrequency(entity.getFrequency());
        medicationOrder.setDuration(entity.getDuration());

        // La relación con Order se asigna desde OrderMapper
        return medicationOrder;
    }
}