package com.example.repository;


import com.example.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Handles the database operation as create, read, update, delete an {@link User} object.
 */

public interface UserRepository extends ReactiveMongoRepository<User, String> {


}
