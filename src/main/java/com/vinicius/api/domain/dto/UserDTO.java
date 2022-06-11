package com.vinicius.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Integer Id;
    private String name;
    private String email;
    @JsonIgnore
    private String password;
}
