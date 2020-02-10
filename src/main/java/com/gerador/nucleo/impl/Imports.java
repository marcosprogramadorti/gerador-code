package com.gerador.nucleo.impl;

import java.util.ArrayList;
import java.util.List;

import com.gerador.nucleo.inter.IImports;

public class Imports implements IImports {

	private List<String> lista;

	@Override
	public String geraListDeImport() {
		StringBuilder r = new StringBuilder();
		for (String imp : lista) {
			r.append("import ").append(imp).append(";\n");
		}

		return r.toString();
	}

	@Override
	public void novo(String imp) {
		if (this.lista == null) {
			this.lista = new ArrayList<>();
		}
		this.lista.add(imp);

	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

}
