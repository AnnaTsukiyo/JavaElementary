package com.savchenko.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOOKS")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE")
    private String title;

 @AttributeOverrides({
         @AttributeOverride(name = "name", column = @Column(name = "author_name")),
         @AttributeOverride(name = "surname", column = @Column(name = "author_surname"))
 })
    private Author author;
    @Column(name = "YEAR")
    private Long issueYear;
    @Column(name = "PRICE")
    private BigDecimal price;

}