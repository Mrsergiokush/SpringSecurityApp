package by.exadel.application.service;

/**
 * Service for security
 *
 * @author Sergej Kushner
 * @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
