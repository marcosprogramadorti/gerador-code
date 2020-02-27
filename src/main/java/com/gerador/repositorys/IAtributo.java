package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Atributo;


@Repository
public interface IAtributo extends JpaRepository<Atributo, Long>, FindByNome<Atributo>{
		
}
		