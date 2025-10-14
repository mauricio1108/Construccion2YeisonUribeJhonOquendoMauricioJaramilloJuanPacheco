package app.Infrastructure.persistence.mapper;

import java.util.stream.Collectors;

import app.Infrastructure.persistence.entities.MedicationOrderEntity;
import app.Infrastructure.persistence.entities.OrderEntity;
import app.domain.model.Order;

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
				order.getMedicationOrders().stream().map(MedicationOrderMapper::toEntity).collect(Collectors.toList()));

		entity.setProcedureOrders(
				order.getProcedureOrders().stream().map(ProcedureOrderMapper::toEntity).collect(Collectors.toList()));

		entity.setDiagnosticAidOrders(order.getDiagnosticAidOrders().stream().map(DiagnosticAidOrderMapper::toEntity)
				.collect(Collectors.toList()));

		return entity;
	}

	public static Order toDomain(OrderEntity entity) {
		if (entity == null) {
			return null;
		}

		Order order = new Order(entity.getOrderNumber(), PatientMapper.toDomain(entity.getPatient()),
				UserMapper.toDomain(entity.getDoctor()), entity.getCreationDate(), entity.getOrderType());

		// Subórdenes
		entity.getMedicationOrders().forEach(med -> order.getMedicationOrders().add(MedicationOrderMapper.toDomain(med)));

		entity.getProcedureOrders().forEach(proc -> order.getProcedureOrders().add(ProcedureOrderMapper.toDomain(proc)));

		entity.getDiagnosticAidOrders()
				.forEach(diag -> order.getDiagnosticAidOrders().add(DiagnosticAidOrderMapper.toDomain(diag)));

		return null;
	}
}
