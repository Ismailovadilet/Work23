package com.company.dao;

import com.company.model.User;

import java.util.List;
import java.util.Objects;


public class UserDao {
    List<User> users;

    public UserDao(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDao userDao = (UserDao) o;
        return Objects.equals(users, userDao.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}
