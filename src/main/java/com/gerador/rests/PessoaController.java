package com.gerador.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gerador.Pessoa;
import com.gerador.repositorys.IPessoa;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
    private IPessoa pessoaRepository;
	
	@GetMapping("/todas")
	public List<Pessoa> getPessoas() {
        return pessoaRepository.findAll();
    }
	@RequestMapping(method = RequestMethod.GET)
	public String teste() {
        return "Teste realizado com sucesso";
    }

}
