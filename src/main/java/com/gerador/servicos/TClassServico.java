
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.TClass;
import com.gerador.repositorys.ITClass;
import com.gerador.servicos.inter.IServico;




@Service
public class TClassServico implements IServico<TClass> {
	
	@Autowired
	ITClass rep;
	
	@Override
	
	public TClass salvar(TClass entidade) {
		TClass salva = rep.save(entidade);
		return salva;
	}

	@Override
	public List<TClass> lista() {
		return rep.findAll();
		
	}

	@Override
	public List<TClass> pesquisar(TClass entidade) {
		List<TClass> r = rep.findByNomeContainingIgnoreCase(entidade.getNome());
		return r;
	}

	@Override
	public TClass buscarPorId(Long id) {
		Optional<TClass> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	
	
	

	
	
}
