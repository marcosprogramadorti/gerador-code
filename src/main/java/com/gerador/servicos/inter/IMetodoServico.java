package com.gerador.servicos.inter;

import java.util.List;

import com.gerador.entidades.Metodo;





public interface IMetodoServico {
	public Metodo salvar(Metodo metodo);
	public List<Metodo> lista();
	public List<Metodo> pesquisarPorDescricao(String descricao);
	public Metodo buscarPorId(Long id);
}
