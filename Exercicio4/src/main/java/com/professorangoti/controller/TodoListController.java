package com.professorangoti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.professorangoti.domain.TodoList;
import com.professorangoti.domain.TodoListItem;
import com.professorangoti.service.TodoListService;

@RestController
@RequestMapping("/todolist")
public class TodoListController {
	@Autowired
	TodoListService service;

	@GetMapping
	public List<TodoList> buscaTodos() {
		return service.buscaTodos();
	}

	@GetMapping("/{id}")
	public TodoList busca(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PostMapping
	public TodoList novo(@RequestBody TodoList item) {
		return service.novo(item);
	}

	@PutMapping("/{id}")
	public TodoList atualizaRegistro(@RequestBody TodoList todoList, @PathVariable Integer id) {
		return service.atualiza(todoList, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}
}
