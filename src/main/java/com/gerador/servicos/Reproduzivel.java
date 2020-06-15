package com.gerador.servicos;

import java.util.List;

import com.gerador.dto.ArquivoDTO;

public interface Reproduzivel {

	List<ArquivoDTO> gera(String f);

}