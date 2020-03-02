package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.TClass;




@Repository
public interface ITClass extends JpaRepository<TClass, Long>, FindByNome<TClass>{	
}
		