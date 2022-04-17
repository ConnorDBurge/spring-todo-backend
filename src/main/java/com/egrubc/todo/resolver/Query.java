package com.egrubc.todo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.egrubc.todo.model.Task;
import com.egrubc.todo.model.Author;
import com.egrubc.todo.repository.TaskRepository;
import com.egrubc.todo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private TaskRepository taskRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public Query(TaskRepository taskRepository, AuthorRepository authorRepository) {
        this.taskRepository = taskRepository;
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> authors() {
        return authorRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public Iterable<Task> tasks() {
        return taskRepository.findAll();
    }

    public long countTasks() {
        return taskRepository.count();
    }
}
