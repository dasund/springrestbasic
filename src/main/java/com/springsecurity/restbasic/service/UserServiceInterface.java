package com.springsecurity.restbasic.service;

import com.springsecurity.restbasic.model.User;

import java.util.List;

/*
 * Copyright 2018 (C) Auxenta.com
 *
 * Created on : Aug , 2018
 * Author     : Dasun De Silva
 *
*/

public interface UserServiceInterface {
    List<User> getAllUsers();
    User getUserById(int userId);
    boolean addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}
