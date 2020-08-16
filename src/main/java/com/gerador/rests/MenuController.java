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

import com.gerador.entidades.Menu;
import com.gerador.servicos.ServicoMenu;




@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
    private ServicoMenu servico;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String recurso() {
        return "recurso ativo";
    }
	
	@GetMapping("/lista")
	public List<Menu> lista() {
        return servico.lista();
    }
	
	@GetMapping("/buscarPorId")
	public Menu buscarPorId(Long id) {
        return servico.buscarPorId(id);
    }
	
	
	@PostMapping("/salvar")
	public Menu salvar(@RequestBody Menu entidade) {
       return servico.salvar(entidade);
       
    }
	@PutMapping("/atualizar")
	public Menu atualizar(Menu entidade) {
       return servico.salvar(entidade);
       
    }

	
	
	
	

}
