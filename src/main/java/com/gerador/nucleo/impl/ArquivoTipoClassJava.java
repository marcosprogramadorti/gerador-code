package com.gerador.nucleo.impl;

import java.util.List;

import com.gerador.nucleo.tipos.tClass;

public class ArquivoTipoClassJava extends Arquivo {
	
	private String tPackage;
	private List<String> tImports;
	private tClass tClass;
	
	
	public String gettPackage() {
		return tPackage;
	}
	public void settPackage(String tPackage) {
		this.tPackage = tPackage;
	}
	public List<String> gettImports() {
		return tImports;
	}
	public void settImports(List<String> tImports) {
		this.tImports = tImports;
	}
	public tClass gettClass() {
		return tClass;
	}
	public void settClass(tClass tClass) {
		this.tClass = tClass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
