package com.gerador.dto;

public class ArquivoDTO  {
	
	private Long idArquivo;
	private String nome;
	private String diretorio;
	private StringBuilder descricao;
	private TipoArquivoDTO tipoArquivo;
	private StringBuilder conteudo;
	public Long getIdArquivo() {
		return idArquivo;
	}
	public void setIdArquivo(Long idArquivo) {
		this.idArquivo = idArquivo;
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
	public TipoArquivoDTO getTipoArquivo() {
		return tipoArquivo;
	}
	public void setTipoArquivo(TipoArquivoDTO tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}
	public StringBuilder getConteudo() {
		return conteudo;
	}
	public void setConteudo(StringBuilder conteudo) {
		this.conteudo = conteudo;
	}
			
}
