package com.company.service.Impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void userAdd(List<User> users, User user) {
        users.add(user);
    }

    @Override
    public void findById(List<User> users, int id) {
        for (User u:users
             ) {
            if (u.getId()==id){
                System.out.println(u);
            }
        }
    }

    @Override
    public void deleteById(List<User> users, int id) {
        users.removeIf(user -> user.getId()==id);
    }

    @Override
    public void getUsers(List<User> user, Object userdao) {
        System.out.println(userdao);
    }
}
