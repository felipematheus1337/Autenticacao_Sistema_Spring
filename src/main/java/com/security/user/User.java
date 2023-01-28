package com.security.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
