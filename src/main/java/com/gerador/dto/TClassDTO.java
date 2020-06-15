package com.gerador.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.gerador.servicos.Materializavel;

public class TClassDTO implements Serializable, Materializavel{

	private static final long serialVersionUID = -197991207802592766L;

	private Long idTClass;
	private String modificadorAcesso;
	private String nome;
	private String tExtends;

	private String tPackage;

	private Set<TImportDTO> tImports;

	private StringBuilder tImplements;

	private StringBuilder inicioCorpo;

	private List<AtributoDTO> atributos;

	private List<MetodoDTO> metodos;

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

	public Set<TImportDTO> gettImports() {
		return tImports;
	}

	public void settImports(Set<TImportDTO> tImports) {
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

	public List<AtributoDTO> getAtributos() {
		return atributos;
	}

	public void setAtributos(List<AtributoDTO> atributos) {
		this.atributos = atributos;
	}

	public List<MetodoDTO> getMetodos() {
		return metodos;
	}

	public void setMetodos(List<MetodoDTO> metodos) {
		this.metodos = metodos;
	}

	public StringBuilder getFimCorpo() {
		return fimCorpo;
	}

	public void setFimCorpo(StringBuilder fimCorpo) {
		this.fimCorpo = fimCorpo;
	}

	@Override
	public StringBuilder obterConteudo() {
		// TODO Auto-generated method stub
		return null;
	}


}
