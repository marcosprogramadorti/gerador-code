package com.gerador.repositorys;

import java.util.List;

public interface FindByDescricao<T> {
	List<T> findByDescricaoContainingIgnoreCase( String nome);
}
