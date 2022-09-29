package website.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import website.dao.UserDao;
import website.model.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.findAllUser();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.createUser(user);
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void removeUser(int id) {
        userDao.deleteUser(id);
    }

    @Transactional(readOnly = true)
    @Override
    public User findUser(int id) {
        return userDao.findUser(id);
    }
}
