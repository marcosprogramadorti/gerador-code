package com.gerador.rests;

import java.io.IOException;
import java.util.Spliterator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;




@RestController
@RequestMapping("/geraEntidade")
public class GeraEntidadeesController  {
	

    @Value("classpath:/public/test.json")
    private Resource resourceFile;
    @GetMapping("/arquivo")
    Resource home() {
        return resourceFile;
    }
    
    @PostMapping("/gerar")
    Resource gerar(@RequestBody Resource o ) throws IOException {
    	System.out.println(o.contentLength());
    	System.out.println(o.getFile());
        return o;
    }
    
    @PostMapping("/gerar2")
    Object gerar2(@RequestBody String o ) throws IOException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	JsonNode jsonNode = objectMapper.readTree(o);
    	jsonNode.getNodeType();
    	//String color = jsonNode.get("endereco").asText();
    	Spliterator<JsonNode> lista = jsonNode.spliterator();
    	
    	
    	return lista;
    	
       
    }
  	
    
	
	
	

}
