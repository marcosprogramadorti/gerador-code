package com.gerador.nucleo.impl;

import java.io.IOException;

import com.gerador.nucleo.inter.IEntidade;
import com.gerador.nucleo.tipos.Cabecalho;

public class Entidade extends ArquivoTipoClassJava implements IEntidade {

	
	@Override
	public boolean produzirEntidade(StringBuilder arq, Atributos a, String codigoLocalizador, String nome,
			String diretorio) throws IOException {

		String textoAtributos = a.geraListDeAtributos();
		
		
		settPackage(null);
		settImports(null);
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.setIncio("public class ");
		cabecalho.setNome(null);
		cabecalho.settExtends(null);
		cabecalho.settImplements(null);
		
		gettClass().setCabecalho(cabecalho);
		gettClass().setCorpo(textoAtributos);
		gettClass().setRodape("}");
		
		
		StringBuilder novoArquivo = Prestativo.sobreporCodigoPorValor(arq, codigoLocalizador, textoAtributos);
		//falta os imports
		alterarNome(nome);
		alterarDiretorio(diretorio);
		produzir(novoArquivo, false);
		return true;

	}

}
