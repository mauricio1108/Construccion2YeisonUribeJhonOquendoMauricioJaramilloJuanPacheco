package app.Infrastructure.adapters;

import app.domain.model.Order;
import app.domain.ports.OrderPort;
import app.Infrastructure.persistence.mapper.OrderMapper;
import app.Infrastructure.persistence.repository.OrderRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class OrderAdapter implements OrderPort {

    private final OrderRepository orderRepository;

    public OrderAdapter(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        var entity = OrderMapper.toEntity(order);
        var saved = orderRepository.save(entity);
        return OrderMapper.toDomain(saved);
    }

    @Override
    public Optional<Order> findById(Long orderId) {
        return orderRepository.findById(orderId).map(OrderMapper::toDomain);
    }

    @Override
    public List<Order> findByPatientId(Long patientId) {
        return orderRepository.findByPatientId(patientId).stream().map(OrderMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<Order> findByPatientDocument(String patientDocument) {
        return orderRepository.findByPatientDocument(patientDocument).stream().map(OrderMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public List<Order> findByDoctorId(Long doctorId) {
        return orderRepository.findByDoctorId(doctorId).stream().map(OrderMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Optional<Order> findByOrderNumber(String orderNumber) {
        return orderRepository.findByOrderNumber(orderNumber).map(OrderMapper::toDomain);
    }

    @Override
    public boolean existsByOrderNumber(String orderNumber) {
        return orderRepository.existsByOrderNumber(orderNumber);
    }
}
