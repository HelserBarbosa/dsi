package com.si.dsi.pessoa.pessoa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("usuarios")
public class PessoaController {
	
	@GetMapping
	public ResponseEntity teste() {
	
		System.out.println("testado");
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
