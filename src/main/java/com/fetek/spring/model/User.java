package com.fetek.spring.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;


@Getter
@Setter
//@Entity
//@Table(name = "USERS")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

//    @Id
    @Id
    private String id;

    private String name;

    private String username;

    private String password;

    private String email;

//    @Enumerated(EnumType.STRING)
    private UserRole userRole;

}