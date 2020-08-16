package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Sistema;

@Repository
public interface ISistema extends JpaRepository<Sistema, Long>,  IServicoGenerico{
	
	@Query("select currval('sistsema_id_seq')")
	Long getNewId();
}
		