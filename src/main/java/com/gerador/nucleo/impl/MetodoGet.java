package com.gerador.nucleo.impl;

import com.gerador.nucleo.inter.IMetodoGet;

public class MetodoGet implements IMetodoGet {

	@Override
	public String geraGet(String tipo, String nome) {

		String nomeCapitalizada = Character.toUpperCase(nome.charAt(0)) + nome.substring(1);

		StringBuilder r = new StringBuilder("public ").append(tipo).append(" get").append(nomeCapitalizada)
				.append("() {\n").append("		return ").append(nome).append(";\n").append("	}");

		return r.toString();
	}

}
