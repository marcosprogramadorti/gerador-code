
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Metodo;
import com.gerador.repositorys.IMetodo;
import com.gerador.servicos.inter.IMetodoServico;





@Service
public class MetodoServico implements IMetodoServico {
	
	@Autowired
	IMetodo rep;
	
	@Override
	public Metodo salvar(Metodo metodo) {
		Metodo salva = rep.save(metodo);
		return salva;
	}

	@Override
	public List<Metodo> lista() {
		return rep.findAll();
		
	}

	@Override
	public List<Metodo> pesquisarPorDescricao(String descricao) {
		List<Metodo> r = rep.findByDescricaoContainingIgnoreCase(descricao);
		return r;
	}

	@Override
	public Metodo buscarPorId(Long id) {
		Optional<Metodo> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	
	
	

	
	
}
