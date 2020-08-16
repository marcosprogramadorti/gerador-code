package com.gerador.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gerador.entidades.Menu;

@Repository
public interface IMenu extends JpaRepository<Menu, Long>,  IServicoGenerico{
	@Query("select currval('menu_id_seq')")
	Long getNewId();
}
		