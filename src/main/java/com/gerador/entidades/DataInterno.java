package com.gerador.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_interno")
public class DataInterno {
	
	@Id
	private Long idDataInterno;
	private String url;
	private String externo;
	private String target;
	private String roles;
	public Long getIdDataInterno() {
		return idDataInterno;
	}
	public void setIdDataInterno(Long idDataInterno) {
		this.idDataInterno = idDataInterno;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getExterno() {
		return externo;
	}
	public void setExterno(String externo) {
		this.externo = externo;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
}
