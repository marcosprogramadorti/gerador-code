package com.gerador.servicos.inter;

import java.util.List;



public interface IServico<T> {
	public T salvar(T atributo);
	public List<T> lista();
	public List<T> pesquisar(T entidade);
	public T buscarPorId(Long id);
}
