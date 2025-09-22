package app.infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "diagnostic_aid_orders")
public class DiagnosticAidOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "aid_name", nullable = false)
    private String aidName;

    @Column(name = "description")
    private String description;

    // Relación con OrderEntity
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEntity order;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAidName() { return aidName; }
    public void setAidName(String aidName) { this.aidName = aidName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public OrderEntity getOrder() { return order; }
    public void setOrder(OrderEntity order) { this.order = order; }
}