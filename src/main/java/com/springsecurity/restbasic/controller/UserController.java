package com.springsecurity.restbasic.controller;

import com.springsecurity.restbasic.model.User;
import com.springsecurity.restbasic.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 * Copyright 2018 (C) Auxenta.com
 *
 * Created on : Aug , 2018
 * Author     : Dasun De Silva
 *
*/

@Controller
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserServiceInterface userServiceInterface;

    @GetMapping("all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> list = userServiceInterface.getAllUsers();
        return new ResponseEntity<List<User>>( list, HttpStatus.OK );
    }
}
