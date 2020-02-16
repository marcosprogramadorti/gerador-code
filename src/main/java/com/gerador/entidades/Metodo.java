package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Metodo")
public class Metodo {
	
	@Id
	private Long idMetodo;
	private StringBuilder descricao;
	public Long getIdMetodo() {
		return idMetodo;
	}
	public void setIdMetodo(Long idMetodo) {
		this.idMetodo = idMetodo;
	}
	public StringBuilder getDescricao() {
		return descricao;
	}
	public void setDescricao(StringBuilder descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
