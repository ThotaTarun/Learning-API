package com.java.spring.tutorial.demo.controller;

import com.java.spring.tutorial.demo.repository.Todo;
import com.java.spring.tutorial.demo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class TodoController
{

    @Autowired
    TodoService todoService;


    //GET to fetch all todos stored
    @GetMapping("/todos")
    public List<Todo> getAllTodos()
    {

        return todoService.getAllTodos();

    }


    //GET Todos based on User
    @GetMapping("/todos/{uname}")
    public List<Todo> getTodo(@PathVariable String uname)
    {
        log.info("IN get todo & passed variable is "+uname);
        return todoService.getTodo(uname);

    }

    //GET Todos based on id
    @GetMapping("/todos/{id}")
    public List<Todo> getTodo(@PathVariable int id)
    {
        log.info("IN get todo & passed variable is "+id);
        return todoService.getTodo(id);

    }


    //POST - Add a new todo
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo1)
    {

        return todoService.addTodo(todo1);

    }

    //PUT update an existing todo based on id
    @PutMapping("/todos/{id}")
    public List<Todo> updateTodo(@RequestBody Todo todo1,@PathVariable int id)
    {

        return todoService.updateTodo(id,todo1);

    }

    //DELETE a todo based on id
    @DeleteMapping("/todos/{id}")
    public List<Todo> deleteTodo(@PathVariable int id)
    {

        return todoService.deleteTodo(id);

    }


}
