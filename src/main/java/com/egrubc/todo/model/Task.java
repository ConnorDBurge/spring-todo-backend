package com.egrubc.todo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "completed", nullable = false)
    private Boolean completed;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = true)
    private User user;
}
