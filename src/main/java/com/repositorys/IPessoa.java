package com.repositorys;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Pessoa;

@Repository
public interface IPessoa extends JpaRepository<Pessoa, BigInteger>{

}
		