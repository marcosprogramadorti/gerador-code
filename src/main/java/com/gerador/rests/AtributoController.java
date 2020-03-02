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
import com.gerador.repositorys.IAtributo;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;




@RestController
@RequestMapping("/atributo")
public class AtributoController implements IRecurso<Atributo> {
	
	@Autowired
    private Servico<Atributo, Long> servico;
	
	@Autowired
    private IAtributo rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Atributo> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public Atributo buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<Atributo> pesquisar(@RequestBody Atributo entidade) {
        return servico.pesquisar(rep, entidade.getNome());
    }
	
	@PostMapping("/salvar")
	public Atributo salvar(@RequestBody Atributo entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public Atributo atualizar(Atributo entidade) {
       return servico.salvar(entidade, rep);
       
    }

	
	
	
	

}
