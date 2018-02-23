package com.sabel.login;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LoginService {

    public boolean checkPassword(String name, String password){
        if (name.length() == 0 || password.length() == 0){
            return false;
        }
        return (name.toLowerCase().equals(password));
    }

}
