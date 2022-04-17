package com.egrubc.todo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(String name) {
        this.name = name;
    }
}
