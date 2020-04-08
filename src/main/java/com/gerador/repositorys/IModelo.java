package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Modelo;

@Repository
public interface IModelo extends JpaRepository<Modelo, Long>, FindByNome<Modelo> {

}
