package com.professorangoti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professorangoti.domain.TodoListItem;
import com.professorangoti.repository.TodoListItemRepository;
@Service
public class TodoListItemService {

	@Autowired
	TodoListItemRepository repository;

	public List<TodoListItem> buscaTodos() {
		return repository.findAll();
	}

	public TodoListItem busca(Integer id) {
		return repository.findById(id).orElseThrow(() -> new TodoListItemNaoEncontradoException(id));
	}

	public TodoListItem novo(TodoListItem item) {
		return repository.save(item);
	}

	public TodoListItem atualiza(TodoListItem todoListItem, Integer id) {
		todoListItem.setId(id);
		return repository.save(todoListItem);
	}

	public void exclui(Integer id) {
		repository.deleteById(id);
	}

}
