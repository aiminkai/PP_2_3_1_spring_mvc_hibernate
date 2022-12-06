package web.service;


import web.model.User;
import java.util.List;

public interface UserService {

    void create(User user);

    List<User> getAllUsers();

    void deleteUser(int id);

    void updateUser(User user);

    User getUserById(int id);
}
