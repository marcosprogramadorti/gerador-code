
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.TImport;
import com.gerador.repositorys.ITImport;
import com.gerador.servicos.inter.IServico;


@Service
public class TImportServico implements IServico<TImport> {
	
	@Autowired
	ITImport rep;
	
	@Override
	public TImport salvar(TImport timport) {
		TImport salva = rep.save(timport);
		return salva;
	}

	@Override
	public List<TImport> lista() {
		return rep.findAll();
		
	}

	@Override
	public List<TImport> pesquisar(TImport entidade) {
		List<TImport> r = rep.findByDescricaoContainingIgnoreCase(entidade.getDescricao());
		return r;
	}

	@Override
	public TImport buscarPorId(Long id) {
		Optional<TImport> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	
	
	

	
	
}
