package com.gerador.dto;

import java.io.Serializable;

public class SistemaDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8172008489721712496L;
	Long id;
	String contexto;
	String sigla;
	String nome;
	String descricao;
	MenuDTO menu;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContexto() {
		return contexto;
	}
	public void setContexto(String contexto) {
		this.contexto = contexto;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public MenuDTO getMenu() {
		return menu;
	}
	public void setMenu(MenuDTO menu) {
		this.menu = menu;
	}
	
	
}
