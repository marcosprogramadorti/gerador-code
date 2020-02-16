package com.gerador.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "propriedade")
public class Propriedade {
	
	@SequenceGenerator(name="pk_sequence",sequenceName="propriedade_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idPropriedade", unique=true, nullable=false)
	private Long idPropriedade;
	
	private String chave;
	private String valor;
	
	
	public Long getIdPropriedade() {
		return idPropriedade;
	}


	public void setIdPropriedade(Long idPropriedade) {
		this.idPropriedade = idPropriedade;
	}


	public String getChave() {
		return chave;
	}


	public void setChave(String chave) {
		this.chave = chave;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Propriedade [idPropriedade=" + idPropriedade + ", chave=" + chave + ", valor=" + valor + "]";
	}
	
}
