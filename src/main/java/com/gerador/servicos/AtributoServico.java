
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Atributo;
import com.gerador.repositorys.IAtributo;
import com.gerador.servicos.inter.IServico;



@Service
public class AtributoServico implements IServico<Atributo> {
	
	@Autowired
	IAtributo rep;
	
	@Override
	public Atributo salvar(Atributo entidade) {
		Atributo salva = rep.save(entidade);
		return salva;
	}

	@Override
	public List<Atributo> lista() {
		return rep.findAll();
		
	}

	@Override
	public List<Atributo> pesquisar(Atributo entidade) {
		List<Atributo> r = rep.findByNomeContainingIgnoreCase(entidade.getNome());
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
