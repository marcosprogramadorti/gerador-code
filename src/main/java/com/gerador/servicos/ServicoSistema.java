
package com.gerador.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Sistema;
import com.gerador.repositorys.ISistema;

@Service
public class ServicoSistema {

	@Autowired
	private ISistema rep;

	public Sistema salvar(Sistema entidade) {

		if (entidade.getIdSistema() == null) {
			Long id = rep.getNewId();
			entidade.setIdSistema(id);
			if (entidade.getMenu() != null) {
				entidade.getMenu().forEach(item-> {
					if (item.getIdMenu() == null) {
						item.setIdSistema(id);
					}
				});
			}
		}
		Sistema salva = rep.save(entidade);
		return salva;

	}

	public List<Sistema> lista() {
		return rep.findAll();
	}

	

	public Sistema buscarPorId(Long id) {
		Optional<Sistema> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}

}
