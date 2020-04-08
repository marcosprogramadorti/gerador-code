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

import com.gerador.entidades.Projeto;
import com.gerador.repositorys.IProjeto;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;




@RestController
@RequestMapping("/projeto")
public class ProjetoController implements IRecurso<Projeto> {
	
	@Autowired
    private Servico<Projeto, Long> servico;
	
	@Autowired
    private IProjeto rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Projeto> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public Projeto buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<Projeto> pesquisar(@RequestBody Projeto entidade) {
        return servico.pesquisar(rep, entidade.getNome());
    }
	
	@PostMapping("/salvar")
	public Projeto salvar(@RequestBody Projeto entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public Projeto atualizar(Projeto entidade) {
       return servico.salvar(entidade, rep);
       
    }

	
	
	
	

}
