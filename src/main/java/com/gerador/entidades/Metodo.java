package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "metodo")
public class Metodo {
	
	@Id
	private Long idMetodo;
	private String descricao;
	
	public Long getIdMetodo() {
		return idMetodo;
	}
	public void setIdMetodo(Long idMetodo) {
		this.idMetodo = idMetodo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
