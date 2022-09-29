package website.service;

import website.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void addUser(User user);

    void editUser(User user);

    void removeUser(int id);

    User findUser(int id);
}
