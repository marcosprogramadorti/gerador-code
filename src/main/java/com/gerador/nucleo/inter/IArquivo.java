package com.gerador.nucleo.inter;

import java.io.IOException;

public interface IArquivo {
	String obterNome();
	String obterDiretorio();
	void alterarNome(String nome);
	void alterarDiretorio(String diretorio);
	//StringBuilder converterModelo(StringBuilder modelo );
	boolean produzir(StringBuilder arq) throws IOException;
}
