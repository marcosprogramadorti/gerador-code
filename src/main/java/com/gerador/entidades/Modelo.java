package com.gerador.entidades;

import java.util.List;

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

@Entity
@Table(name = "modelo")
public class Modelo {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="modelo_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idModelo", unique=true, nullable=false)
	private Long idModelo;
	
	private String nome;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "modelo_arq_class_java",  joinColumns = { 
			@JoinColumn(name = "idModelo", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idArquClassJava", 
					nullable = false, updatable = false) })
	private List<ArqClassJava> listaArqClassJava;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "modelo_arq_pom",  joinColumns = { 
			@JoinColumn(name = "idModelo", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idArqPom", 
					nullable = false, updatable = false) })
	@ManyToOne
	@JoinColumn(name="idArqPom")
	private ArqPom arqPom;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "modelo_arq_pom",  joinColumns = { 
			@JoinColumn(name = "idModelo", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idArqProperties", 
					nullable = false, updatable = false) })
	private List<ArqProperties> listaArqPropertie;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "modelo_arq_sql",  joinColumns = { 
			@JoinColumn(name = "idModelo", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idArqSql", 
					nullable = false, updatable = false) })
	private List<ArqSql> listaArqSql;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "modelo_arq_outro",  joinColumns = { 
			@JoinColumn(name = "idModelo", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idArqOutro", 
					nullable = false, updatable = false) })
	private List<ArqOutro> listaArqOutro;

	public Long getIdModelo() {
		return idModelo;
	}

	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}

	public List<ArqClassJava> getListaArqClassJava() {
		return listaArqClassJava;
	}

	public void setListaArqClassJava(List<ArqClassJava> listaArqClassJava) {
		this.listaArqClassJava = listaArqClassJava;
	}

	public ArqPom getArqPom() {
		return arqPom;
	}

	public void setArqPom(ArqPom arqPom) {
		this.arqPom = arqPom;
	}

	public List<ArqProperties> getListaArqPropertie() {
		return listaArqPropertie;
	}

	public void setListaArqPropertie(List<ArqProperties> listaArqPropertie) {
		this.listaArqPropertie = listaArqPropertie;
	}

	public List<ArqSql> getListaArqSql() {
		return listaArqSql;
	}

	public void setListaArqSql(List<ArqSql> listaArqSql) {
		this.listaArqSql = listaArqSql;
	}

	public List<ArqOutro> getListaArqOutro() {
		return listaArqOutro;
	}

	public void setListaArqOutro(List<ArqOutro> listaArqOutro) {
		this.listaArqOutro = listaArqOutro;
	}
	
	
	
	
	
}
