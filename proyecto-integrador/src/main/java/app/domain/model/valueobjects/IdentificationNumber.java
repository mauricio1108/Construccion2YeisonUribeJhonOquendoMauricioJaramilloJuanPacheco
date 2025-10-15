package app.domain.model.valueobjects;

public class IdentificationNumber {
    private final String value;
    
    private IdentificationNumber(String value) {
        this.value = value != null ? value.trim() : "";
        validate();
    }
    
    public static IdentificationNumber create(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El número de identificación no puede ser null");
        }
        return new IdentificationNumber(value);
    }
    
    private void validate() {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("La cédula de la persona es requerida");
        }
        
        try {
            Long.parseLong(value);
            if (value.length() < 8 || value.length() > 10) {
                throw new IllegalArgumentException(
                    "La cédula debe tener entre 8 y 10 dígitos"
                );
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("La cédula debe contener solo números");
        }
    }
    
    public String getIdentificationNumber() {
        return value;
    }
    
    public String getValue() {
        return value;
    }
    
    public long getAsLong() {
        return Long.parseLong(value);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentificationNumber that = (IdentificationNumber) o;
        return value.equals(that.value);
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}