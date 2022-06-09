package com.vinicius.api.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private Integer Id;
    private String name;
    private String email;
    private String password;
}
