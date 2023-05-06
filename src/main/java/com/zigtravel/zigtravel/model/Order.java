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
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String customerName;

    @Column(name = "slocation")
    private String sLocation;

    @Column(name = "elocation")
    private String eLocation;

    @Column(name = "mobile")
    private String mobileNum;

    @Column(name = "vehicle")
    private String vehicle;

    @Column(name = "email")
    private String email;

}
