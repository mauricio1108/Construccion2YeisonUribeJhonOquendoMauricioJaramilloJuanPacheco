package app.domain.ports;


import app.domain.model.User;

public interface UserPort {
    
    User findByUserName(String user) throws Exception;

    User findByDocument(long document) throws Exception;

    void save(User user) throws Exception;

    void update(User user) throws Exception;

    void delete(long id) throws Exception;
}
