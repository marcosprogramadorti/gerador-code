package com.gerador.rests;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerador.dto.ArquivoDTO;
import com.gerador.servicos.Reproduzivel;


@RestController
@RequestMapping("/gerar")
public class Gerador  {
	
	@Autowired
    private Reproduzivel servico;
	
	@PostMapping("/fonteSQL")
	public List<ArquivoDTO> gerar(@RequestBody String script) {
       return servico.gera(script);
       
    }
		
	
	

}
