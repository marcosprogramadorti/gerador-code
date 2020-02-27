
package com.gerador.servicos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerador.entidades.Atributo;
import com.gerador.repositorys.IAtributo;



@Service
public class AtributoServico {
	
	@Autowired
	Servico<Atributo, Long> s;
	
	@Autowired
	IAtributo rep;
	
	public Atributo salvar(Atributo entidade) {
		return s.salvar(entidade, rep);
	}

	public List<Atributo> lista() {
		return s.lista(rep);
	}

	
	public List<Atributo> pesquisar(Atributo entidade) {
		return s.pesquisar(entidade, rep, entidade.getNome());
	}

	public Atributo buscarPorId(Long id) {
		return s.buscarPorId(id, rep);
	}
	
	
	
	

	
	
}
