package com.gerador;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PESSOA")
	private BigInteger idPessoa;
	@Column(name="NOME")
	private String nome;
	@Column(name="CPF")
	private String cpf;
	
	public BigInteger getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(BigInteger idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

	
	
	
	

}
