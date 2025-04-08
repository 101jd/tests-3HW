package org._jd.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if (user.isAuthenticate)
           data.add(user);
    }

    public User findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void logoutAll(){
        for (User user : data){
            if (!user.isAdmin())
                user.logout();
        }
    }

}