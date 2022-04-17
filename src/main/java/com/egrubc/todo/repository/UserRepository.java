package com.egrubc.todo.repository;

import com.egrubc.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, long> {
}
