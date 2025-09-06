package app.domain.ports;

import app.domain.model.MedicalInsurance;
import app.domain.model.User;

public interface UserPort {
    public MedicalInsurance findByMedicalInsurance(MedicalInsurance medicalInsurance) throws Exception;
	public User findByUserName(User user) throws Exception;
	public void save(User user) throws Exception;
}
