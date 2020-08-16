package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.DataInterno;

@Repository
public interface IDataInterno extends JpaRepository<DataInterno, Long>,  IServicoGenerico{
	
}
		