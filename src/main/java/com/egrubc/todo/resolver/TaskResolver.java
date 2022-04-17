package com.egrubc.todo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.egrubc.todo.model.Author;
import com.egrubc.todo.model.Task;
import com.egrubc.todo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskResolver implements GraphQLResolver<Task> {

    @Autowired
    private AuthorRepository authorRepository;

    public TaskResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Task task) {
        return authorRepository.findById(task.getAuthor().getId()).orElseThrow(null);
    }
}
