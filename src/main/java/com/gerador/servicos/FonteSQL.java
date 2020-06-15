package com.gerador.servicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gerador.dto.ArquivoDTO;
import com.gerador.dto.AtributoDTO;
import com.gerador.dto.TClassDTO;

@Service
public class FonteSQL implements  Reproduzivel {

	@Override
	public List<ArquivoDTO> gera(final String f) {
		final List<ArquivoDTO> lista = new ArrayList<ArquivoDTO>();
		StringBuilder fonte = new StringBuilder(f);
		fonte = ServicoUtil.limpaEspacos(fonte);
		final List<String> listaTabela = ServicoUtil.filtro(fonte.toString(), "(?i)create(\\s)*+table(.)+?(\\s)*\\((.)*?\\);");
		geraListaDeArquivos(lista, listaTabela);
		return lista;
	}
	
	

	private void geraListaDeArquivos(final List<ArquivoDTO> lista, final List<String> listaTabela) {
		for (final String s : listaTabela) {
			final TClassDTO classeNova = new TClassDTO();
			List<AtributoDTO> atributos = new ArrayList<AtributoDTO>();
			classeNova.setModificadorAcesso("public");
			final StringBuilder inicioCorpo = new StringBuilder(" { ");
			classeNova.setInicioCorpo(inicioCorpo);
			final String nome = ServicoUtil.retNomeDeTabela(s);
			final String capNome = ServicoUtil.capNome(nome);
			classeNova.setNome(capNome);
			
			final ArquivoDTO arquivo = new ArquivoDTO();
			arquivo.setNome(capNome + ".java");
			final List<String> listaCampos = ServicoUtil.filtro(s, "(\\s)*\\((.)*?\\);");
			atributos = geraListaDeCampos(listaCampos);
			classeNova.setAtributos(atributos);
			final StringBuilder conteudo = classeNova.obterConteudo();
			arquivo.setConteudo(conteudo);
			lista.add(arquivo);
		}
	}

	private List<AtributoDTO> geraListaDeCampos(final List<String> listaCampos) {
		List<AtributoDTO> atributos = new ArrayList<AtributoDTO>();
		for (final String campos : listaCampos) {
			final List<String> listaCompoETipo = ServicoUtil.filtro(campos, "(\\w)+?([^,])+");
			atributos = geraCamposETipos(listaCompoETipo);
		}
		return atributos;
	}

	private List<AtributoDTO> geraCamposETipos(final List<String> listaCompoETipo) {
		
		List<AtributoDTO> atributos = new ArrayList<AtributoDTO>();
		for (final String c : listaCompoETipo) {
			final List<String> listaCampoTampanho = ServicoUtil.filtro(c, "(\\S)+");
			atributos = geraAtributos(listaCampoTampanho);
		}
		return atributos;
	}

	private List<AtributoDTO> geraAtributos(final List<String> listaCampoTampanho) {
		final List<AtributoDTO> atributos = new ArrayList<AtributoDTO>();
		if (listaCampoTampanho != null && listaCampoTampanho.size() == 2) {
			final AtributoDTO a = new AtributoDTO();
			final String nome = listaCampoTampanho.get(0);
			a.setNome(nome);
			a.setNomeColumn(nome);
			a.setModificador("private");
			final String tipo = ServicoUtil.obtemTipoAtributo(listaCampoTampanho.get(1).toUpperCase());
			a.setTipo(tipo);
			atributos.add(a);
		}
		
		return atributos;
	}

}
