package com.professorangoti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Integer> {

}
