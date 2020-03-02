package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Metodo;




@Repository
public interface IMetodo extends JpaRepository<Metodo, Long>, FindByDescricao<Metodo>{
	
	
	
}
		