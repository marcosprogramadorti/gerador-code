package com.gerador.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sistema")
public class Sistema {

	@Id
//	@SequenceGenerator(name = "pk_sequence", sequenceName = "sistema_sistema_id_seq", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "sistema_id", unique = true, nullable = false)
	private int idSistema;
	private String sigla;
	private String contexto;
	private String descricao;

	@OneToMany
	@JoinColumn(name = "sistema_id")
	private Set<Menu> menu;

	public int getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(int idSistema) {
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

	public Set<Menu> getMenu() {
		return menu;
	}

	public void setMenu(Set<Menu> menu) {
		this.menu = menu;
	}

}
