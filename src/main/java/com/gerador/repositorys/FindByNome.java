package com.gerador.repositorys;

import java.util.List;

public interface FindByNome<T> {
	List<T> findByNomeContainingIgnoreCase( String nome);
}
