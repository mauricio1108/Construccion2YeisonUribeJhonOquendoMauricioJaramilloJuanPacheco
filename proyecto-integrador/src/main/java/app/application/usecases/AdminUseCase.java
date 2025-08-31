
package app.application.usecases;

import app.domain.model.Role;
import app.domain.model.User;
import app.domain.services.CreateUser;

public class AdminUseCase {
    private CreateUser createUser;
    
    public void createHumansResources(User user)throws Exception{
        user.setRole(Role.HUMANS_RESOURCES);
        createUser.create(user);
    }
    
    public void createAdminitrativePersonal(User user)throws Exception{
        user.setRole(Role.ADMINISTRATIVE_PERSONAL);
        createUser.create(user);
    }
    public void createSupport(User user)throws Exception{
        user.setRole(Role.SUPPORT_INFORMATION);
        createUser.create(user);
    }
    
    public void createNurse(User user)throws Exception{
        user.setRole(Role.NURSE);
        createUser.create(user);
    }
    
    public void createDoctor(User user)throws Exception{
        user.setRole(Role.DOCTOR);
        createUser.create(user);
    }
}
