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

import com.gerador.entidades.Metodo;
import com.gerador.repositorys.IMetodo;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;

@RestController
@RequestMapping("/metodo")
public class MetodoController implements IRecurso<Metodo> {
	
	@Autowired
    private Servico<Metodo, Long> servico;
	
	@Autowired
    private IMetodo rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Metodo> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public Metodo buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<Metodo> pesquisar(Metodo entidade) {
        return servico.pesquisar(rep, entidade.getDescricao());
    }
	
	@PostMapping("/salvar")
	public Metodo salvar(@RequestBody Metodo entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public Metodo atualizar(Metodo entidade) {
       return servico.salvar(entidade, rep);
       
    }
	
	
	

}
