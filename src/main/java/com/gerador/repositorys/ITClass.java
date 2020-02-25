package com.gerador.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.TClass;




@Repository
public interface ITClass extends JpaRepository<TClass, Long>{
	
	List<TClass> findByNomeContainingIgnoreCase(String nome);
	
}
		