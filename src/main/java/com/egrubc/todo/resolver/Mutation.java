package com.egrubc.todo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.egrubc.todo.model.Author;
import com.egrubc.todo.repository.AuthorRepository;
import com.egrubc.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private TaskRepository taskRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public Mutation(TaskRepository taskRepository, AuthorRepository authorRepository) {
        this.taskRepository = taskRepository;
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        authorRepository.save(author);
        return author;
    }
}
