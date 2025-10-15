package app.application.dto.request;

import app.domain.model.valueobjects.ValueObjectValidator;
import jakarta.validation.constraints.*;
import java.util.Date;

public record RegisterPatientRequest(
    @NotBlank(message = "El número de identificación es requerido")
    @Pattern(regexp = "\\d{8,10}", message = "La identificación debe tener entre 8 y 10 dígitos")
    String identificationNumber,

    @NotBlank(message = "El nombre completo es requerido")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    String fullName,

    @NotNull(message = "La fecha de nacimiento es requerida")
    Date birthDate,

    @NotBlank(message = "El género es requerido")
    @Pattern(regexp = "^(Hombre|Mujer|Otro)$", message = "El género debe ser Hombre, Mujer u Otro")
    String gender,

    String address,

    @NotBlank(message = "El número de teléfono es requerido")
    @Pattern(regexp = "\\d{10}", message = "El número de teléfono debe tener exactamente 10 dígitos")
    String phoneNumber,

    @NotBlank(message = "El email es requerido")
    @Email(message = "El email debe ser válido")
    String email,

    String emergencyContactName,
    @Pattern(regexp = "\\d{10}", message = "El teléfono de contacto de emergencia debe tener 10 dígitos")
    String emergencyContactPhone,

    @NotBlank(message = "El código de seguro médico es requerido")
    String medicalInsuranceCode
) {
    // Constructor canónico generado por el record con validación temprana
    public RegisterPatientRequest {
        ValueObjectValidator.validateAndGetIdentificationNumber(identificationNumber);
        ValueObjectValidator.validateAndGetFullName(fullName);
        ValueObjectValidator.validateAndGetPhoneNumber(phoneNumber);
        ValueObjectValidator.validateAndGetEmail(email);
        ValueObjectValidator.validateAndGetGender(gender);
        // Nota: emergencyContactPhone y medicalInsuranceCode no tienen Value Objects aún
    }
}