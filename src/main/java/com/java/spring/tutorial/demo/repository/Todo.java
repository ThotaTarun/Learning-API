package com.java.spring.tutorial.demo.repository;

import lombok.*;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@Repository
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Todo
{
    int id;
    String userName;
    String todoName;
    boolean isCompleted;


}
