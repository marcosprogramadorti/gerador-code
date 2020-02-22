
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Atributo;
import com.gerador.repositorys.IAtributo;
import com.gerador.servicos.inter.IAtributoServico;



@Service
public class AtributoServico implements IAtributoServico {
	
	@Autowired
	IAtributo rep;
	
	@Override
	public Atributo salvar(Atributo atributo) {
		Atributo salva = rep.save(atributo);
		return salva;
	}

	@Override
	public List<Atributo> lista() {
		return rep.findAll();
		
	}

	@Override
	public List<Atributo> pesquisarPorNome(String nome) {
		List<Atributo> r = rep.findByNomeContainingIgnoreCase(nome);
		return r;
	}

	@Override
	public Atributo buscarPorId(Long id) {
		Optional<Atributo> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	
	
	

	
	
}
