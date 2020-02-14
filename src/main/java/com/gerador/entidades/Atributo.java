package com.gerador.entidades;

public class Atributo {
	
	private String modificador;
	private String tipo;
	private String nome;
	private String nomeColumn;
	private String tipoId; 
	private int tamanho;
	private String obrigatorio;
	public String getModificador() {
		return modificador;
	}
	public void setModificador(String modificador) {
		this.modificador = modificador;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeColumn() {
		return nomeColumn;
	}
	public void setNomeColumn(String nomeColumn) {
		this.nomeColumn = nomeColumn;
	}
	public String getTipoId() {
		return tipoId;
	}
	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getObrigatorio() {
		return obrigatorio;
	}
	public void setObrigatorio(String obrigatorio) {
		this.obrigatorio = obrigatorio;
	}

	
	
	

}
