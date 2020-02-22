package com.gerador.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gerador.entidades.Atributo;
import com.gerador.servicos.AtributoServico;



@RestController
@RequestMapping("/atributo")
public class AtributoController {
	
	@Autowired
    private AtributoServico servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Atributo> lista() {
        return servico.lista();
    }
	
	@GetMapping("/buscarPorId")
	public Atributo buscarPorId(Long id) {
        return servico.buscarPorId(id);
    }
	
	@GetMapping("/pesquisarPorDescricao")
	public List<Atributo> pesquisarPorDescricao(String nome) {
        return servico.pesquisarPorNome(nome);
    }
	
	@PostMapping("/salvar")
	public Atributo salvar(@RequestBody Atributo atributo) {
       return servico.salvar(atributo);
       
    }
	@PutMapping("/atualizar")
	public Atributo atualizar(Atributo atributo) {
       return servico.salvar(atributo);
       
    }
	
	
	

}
