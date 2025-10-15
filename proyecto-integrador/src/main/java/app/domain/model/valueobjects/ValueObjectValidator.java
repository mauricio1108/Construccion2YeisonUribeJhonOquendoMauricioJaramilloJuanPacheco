package app.domain.model.valueobjects;

public class ValueObjectValidator {
    
    public static String validateAndGetIdentificationNumber(String identificationNumber) {
        try {
            IdentificationNumber id = IdentificationNumber.create(identificationNumber);
            return id.getIdentificationNumber(); // ← Retorna String compatible
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error validando cédula: " + e.getMessage(), e);
        }
    }
    
    public static String validateAndGetFullName(String fullName) {
        try {
            PersonName name = PersonName.create(fullName);
            return name.getFullName(); // ← Retorna String compatible
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error validando nombre: " + e.getMessage(), e);
        }
    }
    
    public static String validateAndGetEmail(String email) {
        try {
            Email emailObj = Email.create(email);
            return emailObj.getEmail(); // ← Retorna String compatible
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error validando email: " + e.getMessage(), e);
        }
    }
    
    public static String validateAndGetPhoneNumber(String phoneNumber) {
        try {
            PhoneNumber phone = PhoneNumber.create(phoneNumber);
            return phone.getPhoneNumber(); // ← Retorna String compatible
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error validando teléfono: " + e.getMessage(), e);
        }
    }
    
    public static String validateAndGetGender(String gender) {
        try {
            Gender genderObj = Gender.create(gender);
            return genderObj.getGender(); // ← Retorna String compatible
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Error validando género: " + e.getMessage(), e);
        }
    }
}