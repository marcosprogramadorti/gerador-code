package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Projeto;




@Repository
public interface IProjeto extends JpaRepository<Projeto, Long>, FindByNome<Projeto>{
		
}
		