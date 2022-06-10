package com.vinicius.api.services.implementations;

import com.vinicius.api.domain.User;
import com.vinicius.api.repositories.UserRepository;
import com.vinicius.api.services.exceptions.ObjectNotFoundException;
import com.vinicius.api.services.interfaces.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
