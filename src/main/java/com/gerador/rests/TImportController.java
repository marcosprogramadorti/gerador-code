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

import com.gerador.entidades.TImport;
import com.gerador.servicos.TImportServico;

@RestController
@RequestMapping("/timport")
public class TImportController {
	
	@Autowired
    private TImportServico servico;
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<TImport> lista() {
        return servico.lista();
    }
	
	@GetMapping("/buscarPorId")
	public TImport buscarPorId(Long id) {
        return servico.buscarPorId(id);
    }
	
	@GetMapping("/pesquisarPorDescricao")
	public List<TImport> pesquisarPorDescricao(String descricao) {
        return servico.pesquisarPorDescricao(descricao);
    }
	
	@PostMapping("/salvar")
	public TImport salvar(@RequestBody TImport timport) {
       return servico.salvar(timport);
       
    }
	@PutMapping("/atualizar")
	public TImport atualizar(TImport timport) {
       return servico.salvar(timport);
       
    }
	
	
	

}
