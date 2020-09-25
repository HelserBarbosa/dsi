package com.si.dsi.pessoa.pessoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("pessoa")
public class PessoaController {
	

	
	@GetMapping(path = "todos")
	public void teste() {
	
		
	}
	
}
