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
import com.gerador.rests.inter.IRecurso;
import com.gerador.servicos.AtributoServico;



@RestController
@RequestMapping("/atributo")
public class AtributoController implements IRecurso<Atributo>{
	
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
	
	@GetMapping("/pesquisar")
	public List<Atributo> pesquisar(@RequestBody Atributo entidade) {
        return servico.pesquisar(entidade);
    }
	
	@PostMapping("/salvar")
	public Atributo salvar(@RequestBody Atributo entidade) {
       return servico.salvar(entidade);
       
    }
	@PutMapping("/atualizar")
	public Atributo atualizar(Atributo atributo) {
       return servico.salvar(atributo);
       
    }

	
	
	
	

}
