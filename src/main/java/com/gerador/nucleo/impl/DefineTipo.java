package com.gerador.nucleo.impl;

import java.math.BigInteger;
import java.util.regex.Pattern;

import com.gerador.enuns.Tipo;
import com.gerador.nucleo.inter.IDefineTipo;

public class DefineTipo implements IDefineTipo {

	private static final Pattern FLOAT_PATTERN = Pattern.compile("^[-+]?\\d{1,19}[.,]\\d{1,4}$");
	private static final Pattern DOUBLE_PATTERN = Pattern.compile("^[-+]?\\d{1,32}[.,]\\d{1,6}$");
	private static final Pattern INT_PATTERN = Pattern.compile("^-?\\d{1,19}$");
	private static final Pattern LONG_PATTERN = Pattern.compile("^-?\\d{1,32}$");

	@Override
	public String retornaTipo(String v) {

		if (verSeFloat(v)) {
			return Tipo.FLOAT_PRIMITIVO.getTipo();
		}
		if (verSeDouble(v)) {
			return Tipo.DOUBLE_PRIMITIVO.getTipo();
		}
		if (verSeInt(v)) {
			return Tipo.INT_PRIMITIVO.getTipo();
		}
		if (verSeLong(v)) {
			return Tipo.LONG.getTipo();
		}
		
		return Tipo.STRING.getTipo();
	}

	private boolean verSeLong(String v) {
		if (LONG_PATTERN.matcher(v).matches()) {
			return true;
		}
		return false;
	}

	private boolean verSeInt(String v) {
		if (INT_PATTERN.matcher(v).matches()) {
			return true;
		}
		return false;
	}

	private boolean verSeFloat(String v) {
		if (FLOAT_PATTERN.matcher(v).matches()) {
			return true;
		}
		return false;

	}

	private boolean verSeDouble(String v) {
		if (DOUBLE_PATTERN.matcher(v).matches()) {
			return true;
		}
		return false;

	}

}
