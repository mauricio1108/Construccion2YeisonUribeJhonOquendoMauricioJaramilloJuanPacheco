package app.domain.model.valueobjects;

public class Gender {
    private final String value;
    
    private Gender(String value) {
        this.value = value != null ? value.trim() : "";
        validate();
    }
    
    public static Gender create(String value) {
        return new Gender(value);
    }
    
    private void validate() {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("El género no puede estar vacío");
        }
        
        String normalized = value.toLowerCase();
        if (!normalized.equals("hombre") && 
            !normalized.equals("mujer") && 
            !normalized.equals("otro")) {
            throw new IllegalArgumentException(
                String.format("Género inválido: %s. Opciones: Hombre, Mujer, Otro", value)
            );
        }
    }
    
    public String getGender() {
        String normalized = value.toLowerCase();
        return switch (normalized) {
            case "hombre" -> "Hombre";
            case "mujer" -> "Mujer";
            default -> "Otro";
        };
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return getGender().equals(gender.getGender());
    }
    
    @Override
    public int hashCode() {
        return getGender().hashCode();
    }
}