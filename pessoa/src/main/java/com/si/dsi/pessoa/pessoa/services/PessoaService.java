package com.si.dsi.pessoa.pessoa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dsi.pessoa.pessoa.models.Pessoa;
import com.si.dsi.pessoa.pessoa.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	public Pessoa saveOne(Pessoa pessoa) {
		return repository.save(pessoa);
	}

	public Pessoa getById(Long id) {
		return repository.getOne(id);
	}

	public Pessoa createOne() {
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Teste");
		return repository.save(pessoa);
	}
}
