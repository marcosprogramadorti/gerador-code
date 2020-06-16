package com.gerador.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TImport")
public class TImport {
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="import_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idImport", unique=true, nullable=false)
	private Long idImport;
	private String descricao;
	public Long getIdImport() {
		return idImport;
	}
	public void setIdImport(Long idImport) {
		this.idImport = idImport;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	
}
