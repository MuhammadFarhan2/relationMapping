package com.example.sms.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "registration")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "regiterId")
    private long id;

    @Column(name = "firstName")
    private  String firstName;

    @Column(name = "lastName")
    private  String lastName;

    @Column(name = "email")
    private  String email;

    @Column(name = "password")
    private  Long password;

    @Column(name = "phone")
    private  Long phone;

    @Column(name = "acountType")
    private String AccountType;


    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

}
