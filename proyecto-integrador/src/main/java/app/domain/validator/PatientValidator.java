package app.domain.validator;

public class PatientValidator extends CommonsValidator {
	public PatientValidator() {
		super();

}
	
	public void validName(String name) throws Exception{
		super.isValidString("el nombre de la persona ", name);
	}
	
	public long validDocument(String document) throws Exception{
		return super.isValidLong("la cedula de la persona ", document);
	}
	
	public int validAge(String age) throws Exception{
		return super.isValidInteger("la edad de la persona ", age);
	}
	
	public Object validGender(String gender) throws Exception {
	    if (gender == null || gender.trim().isEmpty()) {
	        throw new Exception("El género no puede estar vacío");
	    }
	    String g = gender.trim().toLowerCase();
	    if (!g.equals("Hombre") && !g.equals("Mujer") && !g.equals("Otro")) {
	        throw new Exception("Género inválido: " + gender);
	    }
	    return gender; 
	}
	
	public Object validateResidenceAddress(String address) throws Exception {
	    super.isValidString("residence address", address); 
	    return address.trim();
	
	}
	
	public Object validateEmail(String email) throws Exception {
	    Object result = super.isValidString("email", email);
	    String trimmedEmail = ((String) result).trim();
	    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	    if (!trimmedEmail.matches(emailRegex)) {
	        throw new Exception("Invalid email format");
	    }
	    return trimmedEmail;
	}
	
	

}
