package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.TImport;

@Repository
public interface ITImport extends JpaRepository<TImport, Long>, FindByDescricao<TImport>{
	
}
		