package com.cursoscrum.service;

import com.cursoscrum.domain.Role;
import com.cursoscrum.domain.User;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;

@Named
public class WiredUserService implements IUserService {

    public static final List<User> defaultUsers = Arrays.asList(new User[]{
        new User("John", "Doe", "johndoe", "123456", Role.USER),
        new User("Juan", "Pérez", "juanperez", "abcde", Role.USER),
        new User("Alice", "Cooper", "alicecooper", "asdfgh", Role.TRADER),
        new User("María", "González", "mariagonzalez", "zxcvbn", Role.USER)
    });

    private List<User> users;

    public WiredUserService() {
        this.users = defaultUsers;
    }    
    
    public WiredUserService(List<User> users) {
        this.users = users;
    }

    @Override
    public User findUser(User user) {
        int index = users.indexOf(user);
        if (index >= 0) {
            return users.get(index);
        } else {
            return null;
        }
    }
}
