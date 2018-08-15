package com.springsecurity.restbasic.service.impl;

import com.springsecurity.restbasic.dao.UserDAOInterface;
import com.springsecurity.restbasic.model.User;
import com.springsecurity.restbasic.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Copyright 2018 (C) Auxenta.com
 *
 * Created on : Aug , 2018
 * Author     : Dasun De Silva
 *
*/

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    private UserDAOInterface userDAOInterface;

    @Override
    public List<User> getAllUsers() {
        return userDAOInterface.getAllUsers();
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int userId) {

    }
}
