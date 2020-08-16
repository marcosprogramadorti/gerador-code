package com.gerador.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sistema")
public class Sistema {

	@Id
	@Column(name = "sistema_id", columnDefinition = "serial")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSistema;
	
	@Column(name = "sigla", unique = true, nullable = false)
	private String sigla;
	@Column(name = "contexto", unique = true, nullable = false)
	private String contexto;
	
	private String descricao;

	@OneToMany
	@JoinColumn(name = "sistema_id")
	private List<Menu> menu;
	
	public Long getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(Long idSistema) {
		this.idSistema = idSistema;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
