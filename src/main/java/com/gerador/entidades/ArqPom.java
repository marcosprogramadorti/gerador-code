package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arq_pom")
public class ArqPom {
	@Id
	private Long idArqPom;
	private String nome;
	private String diretorio;
	private StringBuilder descricao;

	public Long getIdArqPom() {
		return idArqPom;
	}

	public void setIdArqPom(Long idArqPom) {
		this.idArqPom = idArqPom;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public StringBuilder getDescricao() {
		return descricao;
	}

	public void setDescricao(StringBuilder descricao) {
		this.descricao = descricao;
	}

}
