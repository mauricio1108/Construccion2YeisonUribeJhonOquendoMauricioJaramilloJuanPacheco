package app.domain.model.valueobjects;

public class PhoneNumber {
    private final String value;
    
    private PhoneNumber(String value) {
        this.value = value != null ? value.trim().replaceAll("[^\\d]", "") : "";
        validate();
    }
    
    public static PhoneNumber create(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El número de teléfono no puede ser null");
        }
        return new PhoneNumber(value);
    }
    
    private void validate() {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("El número de teléfono es requerido");
        }
        if (value.length() != 10) {
            throw new IllegalArgumentException(
                "El número de teléfono debe contener exactamente 10 dígitos"
            );
        }
    }
    
    public String getPhoneNumber() {
        return value;
    }
    
    public String getValue() {
        return value;
    }
    
    public String getFormatted() {
        return String.format("%s-%s-%s", 
            value.substring(0, 3), 
            value.substring(3, 6), 
            value.substring(6));
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return value.equals(that.value);
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}