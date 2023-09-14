package com.example.service;

import com.example.dto.UserDto;
import com.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository repository;

    private final UserMapper mapper;

    public UserServiceImpl(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void create(UserDto userDto) {
        try {
            repository.save(mapper.convertBack(userDto));
            LOGGER.info("User is successfully created : " + userDto);
        } catch (DataAccessException e) {
            throw new ServiceException(String.format("Not able to add new user : %s", userDto), e);
        }
    }

    @Override
    public Mono<UserDto> findById(String id) {
        return null;
    }

    @Override
    public Flux<UserDto> findByName(String name) {
        return null;
    }

    @Override
    public Flux<UserDto> findAll() {
        return null;
    }

    @Override
    public Mono<UserDto> update(UserDto userDto) {
        return null;
    }


    @Override
    public Mono<Void> delete(String id) {
        return null;
    }


}
