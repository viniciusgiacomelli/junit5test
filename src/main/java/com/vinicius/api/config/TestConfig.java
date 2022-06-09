package com.vinicius.api.config;

import com.vinicius.api.domain.User;
import com.vinicius.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    UserRepository repository;

    @Bean
    public void startDB(){
        User user1 = new User(1, "Vinicius", "email@gmail.com", "1213");
        User user2 = new User(2, "Vinicius2", "email2@gmail.com", "12132");

        repository.saveAll(List.of(user1, user2));
    }
}
