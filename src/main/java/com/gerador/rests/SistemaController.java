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

import com.gerador.entidades.Sistema;
import com.gerador.repositorys.ISistema;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;




@RestController
@RequestMapping("/sistema")
public class SistemaController implements IRecurso<Sistema> {
	
	@Autowired
    private Servico<Sistema, Long> servico;
	
	@Autowired
    private ISistema rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Sistema> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public Sistema buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<Sistema> pesquisar(@RequestBody Sistema entidade) {
        return servico.pesquisar(rep, entidade.getSigla());
    }
	
	@PostMapping("/salvar")
	public Sistema salvar(@RequestBody Sistema entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public Sistema atualizar(Sistema entidade) {
       return servico.salvar(entidade, rep);
       
    }

	
	
	
	

}
