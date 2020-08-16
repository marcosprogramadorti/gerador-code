
package com.gerador.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Menu;
import com.gerador.repositorys.IMenu;;

@Service
public class ServicoMenu {

	@Autowired
	private IMenu rep;

	public Menu salvar(Menu entidade) {

		if (entidade.getIdMenu() == null) {
			Long id = rep.getNewId();
			entidade.setIdMenu(id);
		}
		Menu salva = rep.save(entidade);
		return salva;

	}

	public List<Menu> lista() {
		return rep.findAll();
	}

	public Menu buscarPorId(Long id) {
		Optional<Menu> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}

}
