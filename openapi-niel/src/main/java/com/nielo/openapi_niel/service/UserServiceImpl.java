package com.nielo.openapi_niel.service;

import com.nielo.openapi_niel.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User("niel", "passniel");
        User user2 = new User("tyson", "tysonpass");
        User user3 = new User("ray", "passray");
        User user4 = new User("kai", "kaipass");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }
}
