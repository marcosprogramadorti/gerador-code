package com.gerador.rests.inter;

import java.util.List;

public interface IRecurso<T> {
	
	public T salvar(T atributo);
	public List<T> lista();
	public List<T> pesquisar(T entidade);
	public T buscarPorId(Long id);

}
