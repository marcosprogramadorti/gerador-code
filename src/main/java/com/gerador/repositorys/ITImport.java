package com.gerador.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.TImport;

@Repository
public interface ITImport extends JpaRepository<TImport, Long>{
	
	List<TImport> findByDescricaoContainingIgnoreCase( String descricao);
	
}
		