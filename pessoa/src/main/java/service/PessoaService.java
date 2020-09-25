package service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.PessoaDTO;
import entity.Pessoa;
import mapper.PessoaMapper;
import repository.PessoaRepository;

@Service
public class PessoaService implements Serializable {
	
	private static final long serialVersionUID = -2776148666377339707L;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<PessoaDTO> getAll() {
		return PessoaMapper.mapper(pessoaRepository.findAll());
	}
	
	public PessoaDTO getById(Integer id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		
		if (pessoa.isPresent()) {
			return PessoaMapper.mapper(pessoa.get());
		}
		return new PessoaDTO();
	}
	
	public PessoaDTO add(PessoaDTO pessoaDTO) {
		return PessoaMapper.mapper(pessoaRepository.save(PessoaMapper.mapper(pessoaDTO)));
	}
	
	public PessoaDTO update(Integer id, PessoaDTO pessoaDTO) {
		if (pessoaRepository.findById(id).isPresent()) {
			return PessoaMapper.mapper(pessoaRepository.save(PessoaMapper.mapper(pessoaDTO)));
		}
		
		return new PessoaDTO();
	}
	
	public void delete(Integer id) {
		pessoaRepository.deleteById(id);
	}

}
