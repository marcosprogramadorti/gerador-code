package com.gerador.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigInteger idPessoa;

	private String nome;

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
