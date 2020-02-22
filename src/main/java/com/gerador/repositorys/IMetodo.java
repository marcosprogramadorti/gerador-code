package com.gerador.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Metodo;




@Repository
public interface IMetodo extends JpaRepository<Metodo, Long>{
	
	List<Metodo> findByDescricaoContainingIgnoreCase( String descricao);
	
}
		