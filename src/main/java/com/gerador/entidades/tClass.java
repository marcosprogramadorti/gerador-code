package com.gerador.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "class")
public class tClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -197991207802592766L;
	
	@Id
	@SequenceGenerator(name="pk_sequence",sequenceName="class_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
	@Column(name="idClass", unique=true, nullable=false)
	private Long idTClass;
	private String modificadorAcesso;
	private String nome;
	private String tExtends;
	
	private StringBuilder tImplements;
	
	private StringBuilder inicioCorpo; 
	private List<Atributo> atributos;
	private List<Metodo> metodos;
	private StringBuilder fimCorpo;
	
	
	
	
	
}
