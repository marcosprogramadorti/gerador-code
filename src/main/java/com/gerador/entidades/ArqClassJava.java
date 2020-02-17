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

@Entity
@Table(name = "arq_class_java")
public class ArqClassJava  {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="arq_class_java_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idArqClassJava", unique=true, nullable=false)	
	private Long idArqClassJava;
	private String nome;
	private String diretorio;
	private String tPackage;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Arq_class_Java_import",  joinColumns = { 
			@JoinColumn(name = "idArqClassJava", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idImport", 
					nullable = false, updatable = false) })
	private Set<TImport> tImports;
	
	@ManyToOne
	@JoinColumn(name="idTClass")
	private tClass tClass;

	public Long getIdArqClassJava() {
		return idArqClassJava;
	}

	public void setIdArqClassJava(Long idArqClassJava) {
		this.idArqClassJava = idArqClassJava;
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

	public String gettPackage() {
		return tPackage;
	}

	public void settPackage(String tPackage) {
		this.tPackage = tPackage;
	}

	public Set<TImport> gettImports() {
		return tImports;
	}

	public void settImports(Set<TImport> tImports) {
		this.tImports = tImports;
	}

	public tClass gettClass() {
		return tClass;
	}

	public void settClass(tClass tClass) {
		this.tClass = tClass;
	}

	
	
	
	
	
	
	
	
	
	
}
