package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arq_properties")
public class ArqProperties {
	
	@Id	
	private Long idArqProperties;
	private String nome;
	private String diretorio;
	private StringBuilder descricao;
	public Long getIdArqProperties() {
		return idArqProperties;
	}
	public void setIdArqProperties(Long idArqProperties) {
		this.idArqProperties = idArqProperties;
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
