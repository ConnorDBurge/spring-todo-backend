package com.egrubc.todo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }

    public Author(String name) {
        this.name = name;
    }
}
