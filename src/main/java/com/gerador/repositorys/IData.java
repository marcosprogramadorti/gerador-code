package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Data;

@Repository
public interface IData extends JpaRepository<Data, Long>,  IServicoGenerico{
	
}
		