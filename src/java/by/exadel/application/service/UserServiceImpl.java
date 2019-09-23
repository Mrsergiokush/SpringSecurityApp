package by.exadel.application.service;

import by.exadel.application.dao.RoleDao;
import by.exadel.application.dao.UserDao;
import by.exadel.application.model.Role;
import by.exadel.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService} interface
 *
 * @author Sergej Kushner
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword())); //set crypt password for User
        Set<Role> roles = new HashSet<>();
        roles.add((roleDao.getOne(1L))); //set one role User
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
