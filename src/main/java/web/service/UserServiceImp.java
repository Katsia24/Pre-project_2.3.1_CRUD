package web.service;

import web.dao.UserDao;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        //userDao.add(new User("User1firstName", "User1lastName", "Userr1@email"));
        return userDao.listUsers();
    }
}
