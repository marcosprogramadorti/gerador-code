package com.gerador.repositorys;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Pessoa;

@Repository
public interface IPessoa extends JpaRepository<Pessoa, BigInteger>{

}
		