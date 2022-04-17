package com.egrubc.todo.repository;

import com.egrubc.todo.model.Author;
import com.egrubc.todo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TaskRepository extends JpaRepository<Task, Long> {

}
