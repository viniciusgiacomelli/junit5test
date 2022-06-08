package com.vinicius.api.resources;

import com.vinicius.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserResources {

    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        User newUser = new User(1,"Vinicius", "vini@gmail.com", "1234");
        return ResponseEntity.ok(newUser);
    }

}
