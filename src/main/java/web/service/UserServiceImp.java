package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.UserDao;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {

//        List<User> users = new ArrayList<User>();
//        users.add(new User("firstNameJava", "lastNameJava", "Java@email"));
//        users.add(new User("userDao.listUsers()", "==", "NULL"));
//        return users;

        return userDao.listUsers();
    }
}
