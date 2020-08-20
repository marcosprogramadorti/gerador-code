
package com.gerador.servicos;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Data;
import com.gerador.entidades.Menu;
import com.gerador.entidades.Sistema;
import com.gerador.nucleo.inter.IdSequence;
import com.gerador.repositorys.IData;
import com.gerador.repositorys.IDataInterno;
import com.gerador.repositorys.IMenu;
import com.gerador.repositorys.ISistema;

@Service
public class ServicoSistema implements IdSequence {

	@Autowired
	private ISistema rep;

	@Autowired
	private IMenu repMenu;

	@Autowired
	private IData repData;

	@Autowired
	private IDataInterno repDataInterno;

	@Autowired
	private DataSource dataSource;

	public Sistema salvar(Sistema entidade) {
		System.out.println("entidade.getIdSistema() >>" + entidade.getIdSistema()  );
		if (entidade.getIdSistema() == null) {
			Long id = getNewId("sistema_id_seq");
			System.out.println("getNewId >>" + id  );
			entidade.setIdSistema(id);
			System.out.println("entidade.getIdSistema() >>" + entidade.getIdSistema()  );
		}
		if (entidade.getMenu() != null) {
			if (entidade.getMenu().getIdMenu()==null) {
				Long id = getNewId("menu_id_seq");
				entidade.getMenu().setIdMenu(id);
			}
			
			
			entidade.getMenu().getData().forEach(i -> {
				
				salvaData(i);

			});
			Menu mSalvo = repMenu.save(entidade.getMenu());
			entidade.setMenu(mSalvo);

		}
		Sistema salva = rep.save(entidade);
		return salva;

	}

	private void salvaData(Data d) {
		if (d.getChildren().size()>0) {
			d.getChildren().forEach(df->{
				salvaData(df);
			});
		}
		if (d.getKey() == null) {
			Long id = getNewId("data_id_seq");
			d.setKey(id);
			d.getData().setIdDataInterno(id);
		}
		if (d.getData()!=null) {
			repDataInterno.save(d.getData());
		}
		repData.save(d);
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
	public void excluirPorId(Long id) {
		rep.deleteById(id);
	}

	@Override
	public Long getNewId(String seq) {
		Long id = ServicoUtil.getIdSequence(dataSource, seq);
		return id;

	}

}
