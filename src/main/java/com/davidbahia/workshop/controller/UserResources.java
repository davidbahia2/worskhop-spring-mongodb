package com.davidbahia.workshop.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidbahia.workshop.domain.User;
import com.davidbahia.workshop.services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/users")
public class UserResources {

    @Autowired
    private UserServices servi;

    @GetMapping("/buscarTodos")
    public ResponseEntity<List<User>> buscaTodos() {
        List<User> list = servi.buscarTodos();
        return ResponseEntity.ok().body(list);
    }
}
