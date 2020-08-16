package com.gerador.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	private Long idMenu;
	
	@OneToMany
	@JoinColumn(name="id_menu")
	private List<Data> data;
	

}
