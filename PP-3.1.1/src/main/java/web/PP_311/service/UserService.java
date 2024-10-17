package web.PP_311.service;



import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

}