package com.gerador.entidades;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class TClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -197991207802592766L;

	@Id
	@SequenceGenerator(name = "pk_sequence", sequenceName = "class_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pk_sequence")
	@Column(name = "idClass", unique = true, nullable = false)
	private Long idTClass;
	private String modificadorAcesso;
	private String nome;
	private String tExtends;

	private String tPackage;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Arq_class_Java_import", joinColumns = {
			@JoinColumn(name = "idArqClassJava", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idImport", nullable = false, updatable = false) })
	private Set<TImport> tImports;

	private StringBuilder tImplements;

	private StringBuilder inicioCorpo;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "class_atributo", joinColumns = {
			@JoinColumn(name = "idClass", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idAtributo", nullable = false, updatable = false) })
	private List<Atributo> atributos;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "class_metodo", joinColumns = {
			@JoinColumn(name = "idClass", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "idMetodo", nullable = false, updatable = false) })
	private List<Metodo> metodos;

	private StringBuilder fimCorpo;

	public Long getIdTClass() {
		return idTClass;
	}

	public void setIdTClass(Long idTClass) {
		this.idTClass = idTClass;
	}

	public String getModificadorAcesso() {
		return modificadorAcesso;
	}

	public void setModificadorAcesso(String modificadorAcesso) {
		this.modificadorAcesso = modificadorAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String gettExtends() {
		return tExtends;
	}

	public void settExtends(String tExtends) {
		this.tExtends = tExtends;
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

	public StringBuilder gettImplements() {
		return tImplements;
	}

	public void settImplements(StringBuilder tImplements) {
		this.tImplements = tImplements;
	}

	public StringBuilder getInicioCorpo() {
		return inicioCorpo;
	}

	public void setInicioCorpo(StringBuilder inicioCorpo) {
		this.inicioCorpo = inicioCorpo;
	}

	public List<Atributo> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}

	public List<Metodo> getMetodos() {
		return metodos;
	}

	public void setMetodos(List<Metodo> metodos) {
		this.metodos = metodos;
	}

	public StringBuilder getFimCorpo() {
		return fimCorpo;
	}

	public void setFimCorpo(StringBuilder fimCorpo) {
		this.fimCorpo = fimCorpo;
	}

	

}
