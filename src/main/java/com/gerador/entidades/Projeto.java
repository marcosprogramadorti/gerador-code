package com.gerador.entidades;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.gerador.enuns.EmbalagemEnum;


@Entity
@Table(name = "projeto")
public class Projeto {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="projeto_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idProjeto", unique=true, nullable=false)
	private Long idProjeto;
	
	private String groupId;
	private String artifactId;
	private String versao;
	private EmbalagemEnum embalagem;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "projeto_propriedade",  joinColumns = { 
			@JoinColumn(name = "idProjeto", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idPropriedade", 
					nullable = false, updatable = false) })
	private Set<Propriedade> propriedades;
	
	@ManyToOne
    @JoinColumn(name = "idModelo")
	private Modelo modelo;
	
	private String autor;
	private String nome;
	private String descricao;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "projeto_entidade",  joinColumns = { 
			@JoinColumn(name = "idProjeto", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idEntidade", 
					nullable = false, updatable = false) })
	private Set<Arquivo> entidades;

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

	public Set<Propriedade> getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(Set<Propriedade> propriedades) {
		this.propriedades = propriedades;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
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

	public Set<Arquivo> getEntidades() {
		return entidades;
	}

	public void setEntidades(Set<Arquivo> entidades) {
		this.entidades = entidades;
	}

	
	
}
