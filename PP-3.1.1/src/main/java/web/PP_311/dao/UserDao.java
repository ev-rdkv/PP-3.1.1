package web.PP_311.dao;



public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

}
