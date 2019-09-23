package by.exadel.application.service;

import by.exadel.application.model.User;

/**
 * Service class for {@link by.exadel.application.model.User}
 *
 * @author Sergej Kushner
 * @version 1.0
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
