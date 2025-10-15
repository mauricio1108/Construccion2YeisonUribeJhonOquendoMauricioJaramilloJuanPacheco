package app.domain.model.valueobjects;

public class Email {
    private final String value;
    
    private Email(String value) {
        this.value = value != null ? value.trim().toLowerCase() : "";
        validate();
    }
    
    public static Email create(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El email no puede ser null");
        }
        return new Email(value);
    }
    
    private void validate() {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("El email es requerido");
        }
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (!value.matches(emailRegex)) {
            throw new IllegalArgumentException(
                "Formato de email inválido: " + value
            );
        }
    }
    
    public String getEmail() {
        return value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email that = (Email) o;
        return value.equals(that.value);
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}