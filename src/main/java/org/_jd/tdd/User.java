package org._jd.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    //3.6.
    public boolean authenticate(String name, String password) {

        if (name.equals(this.name) && password.equals(this.password) && this.isAuthenticate == false)
            return this.isAuthenticate = true;
        return this.isAuthenticate;
    }

    public boolean logout(){
        return this.isAuthenticate = false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}