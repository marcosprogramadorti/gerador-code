package com.gerador.rests;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gerador.entidades.Sistema;
import com.gerador.servicos.ServicoSistema;



@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/sistema")
public class SistemaController {
	
	@Autowired
    private ServicoSistema servico;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Sistema> lista() {
        return servico.lista();
    }
	
	@GetMapping("/buscarPorId")
	public Sistema buscarPorId(Long id) {
        return servico.buscarPorId(id);
    }
	
	
	@PostMapping("/salvar")
	public Sistema salvar(@RequestBody Sistema entidade) {
		System.out.println("/salvar - entidade.getIdSistema() >>" + entidade.getIdSistema()  );
       return servico.salvar(entidade);
       
    }
	@PutMapping("/atualizar")
	public Sistema atualizar(Sistema entidade) {
       return servico.salvar(entidade);
       
    }
	
	@GetMapping("/idSeq")
	public String idSeq() {
        return servico.getNewId("menu_id_seq").toString();
    }

	
	
	
	

}
