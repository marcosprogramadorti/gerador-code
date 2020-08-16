package com.gerador.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "menu_id", unique = true, nullable = false)
	private Long idMenu;

	@Column(name = "sistema_id", nullable = false)
	private int idSistema;
	private String label;
	private String collapsedIcon;
	private String expandedIcon;
	private String url;
	private String externo;
	private String roles;
	
	public Long getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Long idMenu) {
		this.idMenu = idMenu;
	}
	public int getIdSistema() {
		return idSistema;
	}
	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getCollapsedIcon() {
		return collapsedIcon;
	}
	public void setCollapsedIcon(String collapsedIcon) {
		this.collapsedIcon = collapsedIcon;
	}
	public String getExpandedIcon() {
		return expandedIcon;
	}
	public void setExpandedIcon(String expandedIcon) {
		this.expandedIcon = expandedIcon;
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
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

	

}
