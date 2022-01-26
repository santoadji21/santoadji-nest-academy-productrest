package com.santoadji21.springnestacademy.presist.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Data
@Entity
@Table(name ="user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private Long id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String passsword;
}
