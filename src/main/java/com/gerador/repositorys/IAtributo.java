package com.gerador.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Atributo;


@Repository
public interface IAtributo extends JpaRepository<Atributo, Long>{
	
	List<Atributo> findByNomeContainingIgnoreCase( String nome);
	
}
		