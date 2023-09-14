package com.example.service;

import com.example.dto.UserDto;
import com.example.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * Implementation of {@link UserService}.
 */
public interface UserService {

    void create(UserDto userDto);

    Mono<UserDto> findById(String id);

    Flux<UserDto> findByName(String name);

    Flux<UserDto> findAll();

    Mono<UserDto> update(UserDto userDto);

    Mono<Void> delete(String id);

}
