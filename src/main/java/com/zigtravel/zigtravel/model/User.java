package com.zigtravel.zigtravel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String userName;

    @Column(name = "email")
    private String userEmail;

//    @Column(name = "password")
//    private String password;

    @Column(name = "role")
    private String userRole;

    @Column(name = "mobile")
    private String mobileNum;
}
