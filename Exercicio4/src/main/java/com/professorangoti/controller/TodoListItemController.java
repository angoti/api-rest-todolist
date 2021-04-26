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

import com.professorangoti.domain.TodoListItem;
import com.professorangoti.service.TodoListItemService;

@RestController
@RequestMapping("todolistitem")
public class TodoListItemController {

	@Autowired
	TodoListItemService service;

	@GetMapping
	public List<TodoListItem> buscaTodos() {
		return service.buscaTodos();
	}

	@GetMapping("/{id}")
	public TodoListItem busca(@PathVariable Integer id) {
		return service.busca(id);
	}

	@PostMapping
	public TodoListItem novo(@RequestBody TodoListItem item) {
		return service.novo(item);
	}

	@PutMapping("/{id}")
	public TodoListItem atualizaRegistro(@RequestBody TodoListItem todoListItem, @PathVariable Integer id) {
		return service.atualiza(todoListItem, id);
	}

	@DeleteMapping("/{id}")
	void excluiRegistro(@PathVariable Integer id) {
		service.exclui(id);
	}
}
