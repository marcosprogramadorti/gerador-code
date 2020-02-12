package com.gerador.nucleo.inter;

import java.io.IOException;

public interface IArquivo {
	String obterNome();
	String obterDiretorio();
	String alterarNome(String nome);
	String alterarDiretorio(String nome);
	StringBuilder converterModelo(StringBuilder modelo );
	boolean produzir(StringBuilder arq) throws IOException;
}
