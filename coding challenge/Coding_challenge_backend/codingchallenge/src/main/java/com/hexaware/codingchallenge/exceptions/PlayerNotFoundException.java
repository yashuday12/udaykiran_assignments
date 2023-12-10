package com.hexaware.codingchallenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PlayerNotFoundException extends ResponseStatusException {
   
	public PlayerNotFoundException(HttpStatus status, String message) {
		super(status,message);
	}
}
