package com.gerador.nucleo.impl;

import java.util.regex.Pattern;

public class Prestativo {
	
	public static StringBuilder sobreporCodigoPorValor(StringBuilder sb, String codigo, String valor) {
		return new StringBuilder(Pattern.compile(codigo).matcher(sb).replaceAll(valor));
	}

}
