package website.dao;

import website.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUser();

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int user);

    User findUser(int id);
}
