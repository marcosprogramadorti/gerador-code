package com.gerador.entidades;



import java.util.List;

import com.gerador.enuns.EmbalagemEnum;

public class Artefato {
	private Long idArtefato;
	private String groupId;
	private String artifactId;
	private String versao;
	private EmbalagemEnum embalagem;
	private List<Propriedade> propriedades;
	private Modelo modelo;
	
}
