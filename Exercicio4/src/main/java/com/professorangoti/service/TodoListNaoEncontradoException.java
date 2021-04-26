package com.professorangoti.service;

public class TodoListNaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TodoListNaoEncontradoException(Integer id) {
		super("Item não encontrado: " + id);
	}
}
