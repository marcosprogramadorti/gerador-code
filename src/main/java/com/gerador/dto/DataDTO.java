package com.gerador.dto;

import java.util.List;

public class DataDTO {
	String key;
	String label;
	DataInternoDTO data; 
	String expandedIcon;
	String collapsedIcon;
	List<DataDTO> children;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public DataInternoDTO getData() {
		return data;
	}
	public void setData(DataInternoDTO data) {
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
	public List<DataDTO> getChildren() {
		return children;
	}
	public void setChildren(List<DataDTO> children) {
		this.children = children;
	}
	
	
	
}
