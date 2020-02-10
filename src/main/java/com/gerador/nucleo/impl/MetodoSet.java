package com.gerador.nucleo.impl;

import com.gerador.nucleo.inter.IMetodoSet;

public class MetodoSet implements IMetodoSet {

	@Override
	public String geraSet(String tipo, String nome) {

		String nomeCapitalizada = Character.toUpperCase(nome.charAt(0)) + nome.substring(1);

		StringBuilder r = new StringBuilder("public void set").append(nomeCapitalizada)
				.append("(").append(tipo).append(" ").append(nome).append(") {\n" ).append("		this.")
				.append(nome).append(" = ").append(nome).append(";\n").append( 
		"	}");

		return r.toString();
	}

}
