package com.si.dsi.pessoa.pessoa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.si.dsi.pessoa.pessoa.models.Pessoa;
import com.si.dsi.pessoa.pessoa.services.PessoaService;

@Controller
@RequestMapping("pessoas")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping("{id}")
	public ResponseEntity<Pessoa> getById(@PathVariable(name = "id", required = true) Long id) {
		return new ResponseEntity<Pessoa>(service.getById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Pessoa> saveOne(@RequestBody Pessoa pessoa) {
		return new ResponseEntity<Pessoa>(service.saveOne(pessoa), HttpStatus.OK);
	}

	@PostMapping("{teste}")
	public ResponseEntity<Pessoa> createOne() {
		return new ResponseEntity<Pessoa>(service.createOne(), HttpStatus.OK);
	}
}
