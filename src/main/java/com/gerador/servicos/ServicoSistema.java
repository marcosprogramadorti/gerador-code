
package com.gerador.servicos;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Menu;
import com.gerador.entidades.Sistema;
import com.gerador.nucleo.inter.IdSequence;
import com.gerador.repositorys.IMenu;
import com.gerador.repositorys.ISistema;

@Service
public class ServicoSistema implements IdSequence {

	@Autowired
	private ISistema rep;
	
	@Autowired
	private IMenu repMenu;
	
	@Autowired
	private DataSource dataSource;

	public Sistema salvar(Sistema entidade) {

		if (entidade.getIdSistema() == null) {
			Long id = getNewId();
//			entidade.setIdSistema(id);
//			if (entidade.getMenu() != null) {
//				entidade.getMenu().forEach(item-> {
//					if (item.getIdMenu() == null) {
//						item.setIdSistema(id);
//					}
//				});
//			}
		}
		if (entidade.getMenu() != null) {
			Menu mSalvo = repMenu.save(entidade.getMenu());
			entidade.setMenu(mSalvo);
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
	
	@Override
	public Long getNewId() {
		Long id = ServicoUtil.getIdSequence(dataSource, "sistema_id_seq"); 
		return id;
		      
	}

	
	


}


