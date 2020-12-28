package com.savchenko.bookstore.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "CLIENTS")
@EqualsAndHashCode(of = {"firstName", "lastName", "email"})
public
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32, nullable = false)
    private String firstName;
    @Column(length = 32, nullable = false)
    private String lastName;
    @Column(length = 32, nullable = false)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @OneToMany(fetch = FetchType.LAZY)
    List<Order> orders;
}
