package com.java.spring.tutorial.demo.service;

import com.java.spring.tutorial.demo.repository.Todo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService
{

    private List<Todo> todos= new ArrayList<>();


    TodoService()
    {
        Todo todo1=new Todo(1,"Tarun","Learn Java",false);
        Todo todo2=new Todo(2,"Sheldon","Learn Sarcasm",false);
        Todo todo3=new Todo(3,"Raj","Learn to talk with Women",false);
        Todo todo4=new Todo(4,"Penny","Learn Acting",true);

        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);
        todos.add(todo4);
    }


    public List<Todo> getAllTodos()
    {

        return todos;
    }


    public List<Todo> getTodo(String uname)
    {

        List<Todo> todos1= new ArrayList<>();

        todos.forEach((x) ->
        {
            if(x.getUserName().equals(uname)) {
                System.out.println("True" + x);
                todos1.add(x);
            }
        });

        return todos1;

    }

    public List<Todo> getTodo(int id)
    {

        List<Todo> todos1= new ArrayList<>();

        todos.forEach((x) ->
        {
            if(x.getId()==id) {
                System.out.println("True" + x);
                todos1.add(x);
            }
        });

        return todos1;

    }

    public Todo addTodo(Todo todo1)
    {
        todos.add(todo1);
        return todo1;
    }

    public List<Todo> updateTodo(int id,Todo todo1)
    {

        for(int i=0;i<todos.size();i++)
        {
            Todo temp= todos.get(i);
            if(temp.getId()==id)
            {
                todos.set(i,todo1);
                break ;
            }

        }

        return todos;
    }

    public List<Todo> deleteTodo(int id)
    {
        for(int i=0;i<todos.size();i++)
        {
            Todo temp= todos.get(i);
            if(temp.getId()==id)
            {
                todos.remove(i);
                break ;
            }

        }

        return todos;
    }
}
