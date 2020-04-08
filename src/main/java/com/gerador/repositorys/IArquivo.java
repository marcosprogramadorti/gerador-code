package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Arquivo;

@Repository
public interface IArquivo extends JpaRepository<Arquivo, Long>, FindByNome<Arquivo>{
		
}
		