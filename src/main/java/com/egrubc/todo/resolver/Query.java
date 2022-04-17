package com.egrubc.todo.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.egrubc.todo.repository.TaskRepository;
import com.egrubc.todo.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private TaskRepository taskRepository;
    private UserRepository userRepository;
}
