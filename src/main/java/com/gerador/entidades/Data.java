package com.gerador.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Data {

	@Id
	private Long key;
	
	private String label;
	
	@ManyToOne
	private  DataInterno data; 
	
	private String expandedIcon;
	private String collapsedIcon;
	
	@OneToMany
	private List<Data> children;

	public Long getKey() {
		return key;
	}

	public void setKey(Long key) {
		this.key = key;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public DataInterno getData() {
		return data;
	}

	public void setData(DataInterno data) {
		this.data = data;
	}

	public String getExpandedIcon() {
		return expandedIcon;
	}

	public void setExpandedIcon(String expandedIcon) {
		this.expandedIcon = expandedIcon;
	}

	public String getCollapsedIcon() {
		return collapsedIcon;
	}

	public void setCollapsedIcon(String collapsedIcon) {
		this.collapsedIcon = collapsedIcon;
	}

	public List<Data> getChildren() {
		return children;
	}

	public void setChildren(List<Data> children) {
		this.children = children;
	}

		
	
	
	

}
