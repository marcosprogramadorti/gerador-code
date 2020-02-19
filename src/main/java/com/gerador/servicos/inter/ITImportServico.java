package com.gerador.servicos.inter;

import java.util.List;

import com.gerador.entidades.TImport;

public interface ITImportServico {
	public TImport salvar(TImport timport);
	public List<TImport> lista();
	public List<TImport> pesquisarPorDescricao(String descricao);
	public TImport buscarPorId(Long id);
}
