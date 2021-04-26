package com.professorangoti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professorangoti.domain.TodoList;
import com.professorangoti.repository.TodoListRepository;

@Service
public class TodoListService {
	@Autowired
	TodoListRepository repository;

	public List<TodoList> buscaTodos() {
		return repository.findAll();
	}

	public TodoList busca(Integer id) {
		return repository.findById(id).orElseThrow(() -> new TodoListNaoEncontradoException(id));
	}

	public TodoList novo(TodoList item) {
		return repository.save(item);
	}

	public TodoList atualiza(TodoList todoList, Integer id) {
		todoList.setId(id);
		return repository.save(todoList);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
