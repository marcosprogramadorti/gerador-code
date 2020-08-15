package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Sistema;

@Repository
public interface ISistema extends JpaRepository<Sistema, Long>, FindByDescricao<Sistema>, IServicoGenerico{
	
}
		