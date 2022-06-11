package com.vinicius.api.services.interfaces;

import com.vinicius.api.domain.User;

import java.util.List;

public interface UserServices {

    User findById(Integer id);
    List<User> findAll();
}
