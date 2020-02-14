package com.gerador.nucleo.impl;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gerador.nucleo.inter.IAtributos;
import com.gerador.nucleo.tipos.Atributo;

public class Atributos implements IAtributos {

	private List<Atributo> atributos;

	ObjectMapper mapper = new ObjectMapper();

	@Override
	public String geraListDeAtributos() {
		//falta os @Colluns
		StringBuilder r = new StringBuilder();
		for (Atributo a : atributos) {
			r.append(a.getModificador()).append(" ").append(a.getTipo()).append(" ").append(a.getNome()).append(";\n");
		}
		return r.toString();
	}

	@Override
	public void novo(Atributo a) {
		if (atributos == null) {
			this.atributos = new ArrayList<>();
		}
		this.atributos.add(a);
	}

}
