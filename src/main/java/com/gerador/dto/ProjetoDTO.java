package com.gerador.dto;

import java.util.Set;

import com.gerador.enuns.EmbalagemEnum;

public class ProjetoDTO {

	private Long idProjeto;

	private String groupId;
	private String artifactId;
	private String versao;
	private EmbalagemEnum embalagem;

	private Set<PropriedadeDTO> propriedades;

	private ModeloDTO modelo;

	private String autor;
	private String nome;
	private String descricao;

	private Set<ArquivoDTO> entidades;

	public Long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public EmbalagemEnum getEmbalagem() {
		return embalagem;
	}

	public void setEmbalagem(EmbalagemEnum embalagem) {
		this.embalagem = embalagem;
	}

	public Set<PropriedadeDTO> getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(Set<PropriedadeDTO> propriedades) {
		this.propriedades = propriedades;
	}

	public ModeloDTO getModelo() {
		return modelo;
	}

	public void setModelo(ModeloDTO modelo) {
		this.modelo = modelo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
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

	public Set<ArquivoDTO> getEntidades() {
		return entidades;
	}

	public void setEntidades(Set<ArquivoDTO> entidades) {
		this.entidades = entidades;
	}

}
