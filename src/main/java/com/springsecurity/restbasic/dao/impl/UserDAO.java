package com.springsecurity.restbasic.dao.impl;

/*
 * Copyright 2018 (C) Auxenta.com
 * 
 * Created on : Aug , 2018
 * Author     : Dasun De Silva
 *
*/
import com.springsecurity.restbasic.dao.UserDAOInterface;
import com.springsecurity.restbasic.model.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class UserDAO implements UserDAOInterface {
    @Override
    public User getUserById(int userId) {
        //HERE YOU CAN DO ANY DATABASE TRANSACTION FUNCTIONS
        return null;
    }

    @Override
    public void addUser(User user) {
        //HERE YOU CAN DO ANY DATABASE TRANSACTION FUNCTIONS
    }

    @Override
    public List<User> getAllUsers() {
        //HERE YOU CAN DO ANY DATABASE TRANSACTION FUNCTIONS. FOR NOW I HAVE HARD CODED THE DATA.
        User user = new User( 1,"testusername","testpassword");
        User user2 = new User( 2 ,"testusername2","testpassword2");
        List<User> listUsers = new ArrayList<>();
        listUsers.add( user );
        listUsers.add( user2 );
        return listUsers;
    }

    @Override
    public void updateUser(User user) {
        //HERE YOU CAN DO ANY DATABASE TRANSACTION FUNCTIONS
    }
}
