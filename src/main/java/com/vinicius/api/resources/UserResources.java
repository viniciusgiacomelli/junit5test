package com.vinicius.api.resources;

import com.vinicius.api.domain.User;
import com.vinicius.api.domain.dto.UserDTO;
import com.vinicius.api.services.implementations.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name="User")
@RestController
@RequestMapping(value="/users")
public class UserResources {

    @Autowired
    private UserServiceImpl service;

    @Autowired
    private ModelMapper mapper;

    @Operation(description="Retorna um usuário através do ID")
    @GetMapping(value="/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(mapper.map(service.findById(id),UserDTO.class));
    }

    @Operation(description = "Retorna todos os usuários cadastrados")
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = service.findAll();
        List<UserDTO> listDTO = list.stream().map(x -> mapper.map(x, UserDTO.class)).toList();
        return ResponseEntity.ok().body(listDTO);
    }

}
