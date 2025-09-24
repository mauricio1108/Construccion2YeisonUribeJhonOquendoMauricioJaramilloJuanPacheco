package app.Infrastructure.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "procedure_orders")
public class ProcedureOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "procedure_name", nullable = false)
    private String procedureName;

    @Column(name = "description")
    private String description;

    // Relación con OrderEntity
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private OrderEntity order;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProcedureName() { return procedureName; }
    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public OrderEntity getOrder() { return order; }
    public void setOrder(OrderEntity order) { this.order = order; }
}