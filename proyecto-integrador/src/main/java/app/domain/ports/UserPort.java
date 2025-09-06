package app.domain.ports;

import app.domain.model.MedicalInsurance;
import app.domain.model.User;

public interface UserPort {
    public UserPort userPort = null;
	public User doctor = null;
	public MedicalInsurance findByMedicalInsurance(MedicalInsurance medicalInsurance) throws Exception;
	public User findByUserName(User user) throws Exception;
	public void save(User user) throws Exception;
	public User user = userPort.findByDocument(doctor);
	public User findByDocument(User doctor);
}
