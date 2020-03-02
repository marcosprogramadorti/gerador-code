package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Propriedade;


@Repository
public interface IPropriedade extends JpaRepository<Propriedade, Long>, FindByChave<Propriedade>{
		
}
		