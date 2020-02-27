
package com.gerador.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gerador.repositorys.FindByNome;



@Service
public class Servico<T, ID>  {
	
	
	
	
	public T salvar(T entidade, JpaRepository<T, ID> rep) {
		T salva = rep.save(entidade);
		return salva;
	}

	
	public List<T> lista(JpaRepository<T,ID> rep) {
		return rep.findAll();
		
	}

	public List<T> pesquisar(T entidade, FindByNome<T> rep, String nome) {
		return rep.findByNomeContainingIgnoreCase(nome);
	}

	
	public T buscarPorId(ID id, JpaRepository<T, ID>  rep) {
		Optional<T> r = rep.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}
	
	
	
	

	
	
}
