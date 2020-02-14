package com.gerador.nucleo.inter;

import java.io.IOException;

public interface IArquivo {
	String obterNome();
	String obterDiretorio();
	void alterarNome(String nome);
	void alterarDiretorio(String diretorio);
	boolean produzir(StringBuilder arq, boolean adicionar) throws IOException;
}
