package com.gerador.nucleo.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.gerador.nucleo.inter.IArquivo;

public abstract class ArquivoBasico implements IArquivo {

	private String nome;
	private String diretorio;

	@Override
	public String obterNome() {
		return this.nome;
	}

	@Override
	public String obterDiretorio() {
		return this.diretorio;
	}

	@Override
	public void alterarNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void alterarDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	@Override
	public boolean produzir(StringBuilder arq, boolean adicionar) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		boolean createFile = false;
		String diretorioComNome = obterDiretorio() + "/" + obterNome(); 
		try {
			File arquivo = new File(diretorioComNome);
			// verifica se o arquivo ou diretório existe
			boolean existe = arquivo.exists();
			
			//if (!existe) {
				// cria um arquivo (vazio)
					createFile = arquivo.createNewFile();
					//if (createFile) {
					// cria um diretório
					arquivo.mkdir();

					// construtor que recebe também como argumento se o conteúdo será
					// acrescentado
					// ao invés de ser substituído (append)
					fw = new FileWriter(arquivo, adicionar);
					// construtor recebe como argumento o objeto do tipo FileWriter
					bw = new BufferedWriter(fw);
					bw.write(arq.toString());
					arquivo = null;

				//}

			//}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		finally {
			if (bw != null) {
				bw.close();
			}
			if (fw != null) {
				fw.close();
			}

		}
		return true;
	}

}

