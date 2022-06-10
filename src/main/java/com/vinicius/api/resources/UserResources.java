package com.vinicius.api.resources;

import com.vinicius.api.domain.User;
import com.vinicius.api.services.implementations.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="User")
@RestController
@RequestMapping(value="/user")
public class UserResources {

    @Autowired
    UserServiceImpl service;

    @Operation(
            description="Busca um usuário através do ID"
    )
    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        User newUser = service.findById(id);
        return ResponseEntity.ok(newUser);
    }

}
