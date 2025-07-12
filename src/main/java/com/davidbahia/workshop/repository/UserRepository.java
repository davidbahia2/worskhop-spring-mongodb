package com.davidbahia.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.davidbahia.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
