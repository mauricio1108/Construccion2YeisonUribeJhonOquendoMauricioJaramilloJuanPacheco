package app.domain.model.valueobjects;

public class PersonName {
    private final String value;
    
    private PersonName(String value) {
        this.value = value != null ? value.trim() : "";
        validate();
    }
    
    public static PersonName create(String value) {
        if (value == null) {
            throw new IllegalArgumentException("El nombre no puede ser null");
        }
        return new PersonName(value);
    }
    
    private void validate() {
        if (value.isEmpty()) {
            throw new IllegalArgumentException("El nombre completo es requerido");
        }
        if (value.length() < 2 || value.length() > 100) {
            throw new IllegalArgumentException(
                "El nombre debe tener entre 2 y 100 caracteres"
            );
        }
    }
    
    public String getFullName() {
        return value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonName that = (PersonName) o;
        return value.equals(that.value);
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }
}