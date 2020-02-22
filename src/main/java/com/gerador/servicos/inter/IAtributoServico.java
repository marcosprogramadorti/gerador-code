package com.gerador.servicos.inter;

import java.util.List;

import com.gerador.entidades.Atributo;



public interface IAtributoServico {
	public Atributo salvar(Atributo atributo);
	public List<Atributo> lista();
	public List<Atributo> pesquisarPorNome(String nome);
	public Atributo buscarPorId(Long id);
}
