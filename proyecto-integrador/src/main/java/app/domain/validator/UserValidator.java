package app.domain.validator;

public class UserValidator extends CommonsValidator{
	
	public void validUserName(String userName) throws Exception {
		super.isValidString("el nombre de usuario ", userName);
	}
	public void validPassword(String password) throws Exception {
		super.isValidString(" contraseña  del usuario ", password);
	}
	public void validRole(String role) throws Exception {
		super.isValidString("el rol del  usuario ", role);
	}

}
