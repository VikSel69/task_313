package app.service;

import app.model.Role;
import app.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface AppService extends UserDetailsService {

    List<User> findAllUsers();

    User findUser(Long id);

    User saveUser(User user);

    void deleteUser(Long id);

    Iterable<Role> findAllRoles();
}
