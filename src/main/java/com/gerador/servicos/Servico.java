
package com.gerador.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gerador.repositorys.FindByChave;
import com.gerador.repositorys.FindByDescricao;
import com.gerador.repositorys.FindByNome;
import com.gerador.servicos.inter.IServico;

@Service
public class Servico<T, ID> implements IServico<T, ID> {

	@Override
	public T salvar(T entidade, JpaRepository<T, ID> rep) {
		T salva = rep.save(entidade);
		rep.flush();
		return salva;
	}

	@Override
	public List<T> lista(JpaRepository<T, ID> rep) {
		return rep.findAll();
	}

	@Override
	public List<T> pesquisar(FindByNome<T> rep, String nome) {
		return rep.findByNomeContainingIgnoreCase(nome);
	}

	@Override
	public List<T> pesquisar(FindByDescricao<T> rep, String nome) {
		return rep.findByDescricaoContainingIgnoreCase(nome);
	}
	@Override
	public List<T> pesquisar(FindByChave<T> rep, String nome) {
		return rep.findByChaveContainingIgnoreCase(nome);
	}

	@Override
	public T buscarPorId(ID id, JpaRepository<T, ID> rep) {
		Optional<T> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}

}
