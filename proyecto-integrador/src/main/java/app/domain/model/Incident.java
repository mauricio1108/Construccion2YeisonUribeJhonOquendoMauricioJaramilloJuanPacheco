package app.domain.model;
import java.time.LocalDateTime;

public class Incident {
	private Long id;
    private String title;              // Título corto del incidente
    private String description;        // Detalle del incidente
    private String type;               // Tipo (clínico, administrativo, soporte, etc.)
    private String status;             // Estado (Abierto, En Proceso, Resuelto, Cerrado)
    private LocalDateTime reportedAt;  // Fecha/hora de registro
    private String reportedBy;         // Usuario o rol que lo reporta
    private String assignedTo;         // Persona/rol encargado de resolverlo


public Incident() {}

public Incident(Long id, String title, String description, String type, String status,
        LocalDateTime reportedAt, String reportedBy, String assignedTo) {
this.id = id;
this.title = title;
this.description = description;
this.type = type;
this.status = status;
this.reportedAt = reportedAt;
this.reportedBy = reportedBy;
this.assignedTo = assignedTo;

}

	public Long getId() {
    return id;
	}

	public void setId(Long id) {
    this.id = id;
	}

	public String getTitle() {
    return title;
	}

	public void setTitle(String title) {
    this.title = title;
	}

	public String getDescription() {
    return description;
	}

	public void setDescription(String description) {
    this.description = description;
	}

	public String getType() {
    return type;
	}

	public void setType(String type) {
    this.type = type;
	}

	public String getStatus() {
    return status;
	}

	public void setStatus(String status) {
    this.status = status;
	}

	public LocalDateTime getReportedAt() {
    return reportedAt;
	}

	public void setReportedAt(LocalDateTime reportedAt) {
    this.reportedAt = reportedAt;
	}

	public String getReportedBy() {
    return reportedBy;
	}

	public void setReportedBy(String reportedBy) {
    this.reportedBy = reportedBy;
	}

	public String getAssignedTo() {
    return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
    this.assignedTo = assignedTo;
	}
}