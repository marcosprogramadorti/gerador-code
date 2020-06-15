package com.gerador.dto;

public class PropriedadeDTO {

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
