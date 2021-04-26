package com.professorangoti.service;

public class TodoListItemNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TodoListItemNaoEncontradoException(Integer id) {
		super("Item não encontrado: " + id);
	}

}
