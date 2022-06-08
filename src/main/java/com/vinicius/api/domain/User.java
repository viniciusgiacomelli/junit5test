package com.vinicius.api.domain;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tb_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String name;

    @Column(unique=true)
    private String email;
    private String password;

}
