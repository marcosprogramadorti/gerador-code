package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arq_sql")
public class ArqSql {
	
	@Id	
	private Long idArqSql;
	private String nome;
	private String diretorio;
	private StringBuilder descricao;
	public Long getIdArqSql() {
		return idArqSql;
	}
	public void setIdArqSql(Long idArqSql) {
		this.idArqSql = idArqSql;
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
