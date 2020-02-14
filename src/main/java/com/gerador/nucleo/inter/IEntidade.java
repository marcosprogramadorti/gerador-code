package com.gerador.nucleo.inter;

import java.io.IOException;

import com.gerador.nucleo.impl.Atributos;

public interface IEntidade {
	boolean produzirEntidade(StringBuilder arq, Atributos a, String codigoLocalizador, String nome, String diretorio)
			throws IOException;
}
