package com.professorangoti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professorangoti.domain.TodoListItem;

public interface TodoListItemRepository extends JpaRepository<TodoListItem, Integer> {

}
