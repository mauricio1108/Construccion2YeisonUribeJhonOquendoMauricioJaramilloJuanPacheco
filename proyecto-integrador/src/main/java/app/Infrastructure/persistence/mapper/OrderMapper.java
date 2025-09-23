package app.infrastructure.persistence.mapper;

import app.domain.model.Order;
import app.domain.model.Patient;
import app.domain.model.User;
import app.infrastructure.persistence.entities.*;

import java.util.stream.Collectors;

public class OrderMapper {

    public static OrderEntity toEntity(Order order) {
        if (order == null) {
            return null;
        }

        OrderEntity entity = new OrderEntity();
        entity.setOrderNumber(order.getOrderNumber());
       // entity.setCreationDate(order.getCreationDate());

        // Relaciones principales
        entity.setPatient(PatientMapper.toEntity(order.getPatient()));
        entity.setDoctor(UserMapper.toEntity(order.getDoctor()));

        // Subórdenes
        entity.setMedicationOrders(
            order.getMedicationOrders().stream()
                 .map(MedicationOrderMapper::toEntity)
                 .collect(Collectors.toSet())
        );

        entity.setProcedureOrders(
            order.getProcedureOrders().stream()
                 .map(ProcedureOrderMapper::toEntity)
                 .collect(Collectors.toSet())
        );

        entity.setDiagnosticAidOrders(
            order.getDiagnosticAidOrders().stream()
                 .map(DiagnosticAidOrderMapper::toEntity)
                 .collect(Collectors.toSet())
        );

        return entity;
    }

    public static Order toDomain(OrderEntity entity) {
        if (entity == null) {
            return null;
        }

      /*  Order order = new Order(
            entity.getOrderNumber(),
            PatientMapper.toDomain(entity.getPatient()),
            UserMapper.toDomain(entity.getDoctor()),
            entity.getCreationDate()
        );

        // Subórdenes
        entity.getMedicationOrders().forEach(med ->
            order.addMedicationOrder(MedicationOrderMapper.toDomain(med))
        );

        entity.getProcedureOrders().forEach(proc ->
            order.addProcedureOrder(ProcedureOrderMapper.toDomain(proc))
        );

        entity.getDiagnosticAidOrders().forEach(diag ->
            order.addDiagnosticAidOrder(DiagnosticAidOrderMapper.toDomain(diag))
        );*/

        return null;
    }
}