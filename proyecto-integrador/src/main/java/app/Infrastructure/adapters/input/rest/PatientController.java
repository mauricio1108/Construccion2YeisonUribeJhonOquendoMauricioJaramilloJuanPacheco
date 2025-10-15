package app.infrastructure.adapters.input.rest;

import app.application.dto.request.RegisterPatientRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @PostMapping
    public ResponseEntity<String> registerPatient(
        @Valid @RequestBody RegisterPatientRequest request) {
        // Lógica para procesar (p.ej., delegar a UseCase)
        return ResponseEntity.ok("Paciente registrado con éxito a las " + new java.util.Date());
    }
}