package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "import")
public class TImport {
	
	@Id
	private Long idImport;
	private String tImport;
	
	public Long getIdImport() {
		return idImport;
	}
	public void setIdImport(Long idImport) {
		this.idImport = idImport;
	}
	public String gettImport() {
		return tImport;
	}
	public void settImport(String tImport) {
		this.tImport = tImport;
	}
	
	
}
