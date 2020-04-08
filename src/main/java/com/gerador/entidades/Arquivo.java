package com.gerador.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "arquivo")
public class Arquivo  {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="arquivo_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idArquivo", unique=true, nullable=false)	
	private Long idArquivo;
	private String nome;
	private String diretorio;
	private StringBuilder descricao;
	
	@ManyToOne
	@JoinColumn(name="idTipoArquivo")
	private TipoArquivo tipoArquivo;
	
	@ManyToOne
	@JoinColumn(name = "idTClass")
	private TClass tClass;

	public Long getIdArquivo() {
		return idArquivo;
	}

	public void setIdArquivo(Long idArquivo) {
		this.idArquivo = idArquivo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public StringBuilder getDescricao() {
		return descricao;
	}

	public void setDescricao(StringBuilder descricao) {
		this.descricao = descricao;
	}

	public TipoArquivo getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(TipoArquivo tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public TClass gettClass() {
		return tClass;
	}

	public void settClass(TClass tClass) {
		this.tClass = tClass;
	}

	
	
	
	
	
}
