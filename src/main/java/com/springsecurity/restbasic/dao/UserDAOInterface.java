package com.springsecurity.restbasic.dao;

import com.springsecurity.restbasic.model.User;

import java.util.List;

/*
 * Copyright 2018 (C) Auxenta.com
 *
 * Created on : Aug , 2018
 * Author     : Dasun De Silva
 *
*/

public interface UserDAOInterface {
    User getUserById(int userId);
    void addUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
}
