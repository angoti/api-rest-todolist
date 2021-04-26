package com.professorangoti.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.professorangoti.service.TodoListItemNaoEncontradoException;
import com.professorangoti.service.TodoListNaoEncontradoException;

@ControllerAdvice
public class ExceptionsController {

	@ResponseBody
	@ExceptionHandler(TodoListItemNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String itemNaoEncontradoHandler(TodoListItemNaoEncontradoException ex) {
		return ex.getMessage();
	}
	
	@ResponseBody
	@ExceptionHandler(TodoListNaoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String listaNaoEncontradoHandler(TodoListNaoEncontradoException ex) {
		return ex.getMessage();
	}
	
	
}
