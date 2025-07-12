package com.davidbahia.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidbahia.workshop.domain.User;
import com.davidbahia.workshop.repository.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> buscarTodos() {
        return repo.findAll();
    }

}
