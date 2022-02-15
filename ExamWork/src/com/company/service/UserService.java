package com.company.service;


import com.company.model.User;

import java.util.List;

public interface UserService {
    void userAdd(List<User> users, User user);

    void findById(List<User> users, int id);

    void deleteById(List<User> users, int id);

    void getUsers(List<User> user, Object userdao);

}
