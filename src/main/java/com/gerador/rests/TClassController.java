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

import com.gerador.entidades.TClass;
import com.gerador.repositorys.ITClass;
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.Servico;


@RestController
@RequestMapping("/class")
public class TClassController implements IRecurso<TClass> {
	
	@Autowired
    private Servico<TClass, Long> servico;
	
	@Autowired
    private ITClass rep;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<TClass> lista() {
        return servico.lista(rep);
    }
	
	@GetMapping("/buscarPorId")
	public TClass buscarPorId(Long id) {
        return servico.buscarPorId(id, rep);
    }
	
	@GetMapping("/pesquisar")
	public List<TClass> pesquisar(TClass entidade) {
        return servico.pesquisar(rep, entidade.getNome());
    }
	
	@PostMapping("/salvar")
	public TClass salvar(@RequestBody TClass entidade) {
       return servico.salvar(entidade, rep);
       
    }
	@PutMapping("/atualizar")
	public TClass atualizar(TClass entidade) {
       return servico.salvar(entidade, rep);
       
    }
	
	
	

}
