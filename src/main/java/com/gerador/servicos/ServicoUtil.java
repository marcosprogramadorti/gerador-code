package com.gerador.servicos;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicoUtil {

	public static void infoDoDispositivo(String[] args) throws SocketException {

		// NetworkInterface implements a static method that returns all the interfaces
		// on the PC,
		// which we add on a list in order to iterate over them.

		System.out.println("Printing information about the available interfaces...\n");
		for (Enumeration<NetworkInterface> enNetI = NetworkInterface.getNetworkInterfaces(); enNetI.hasMoreElements();)

		{
			NetworkInterface iface = enNetI.nextElement();
			// Due to the amount of the interfaces, we will only print info
			// about the interfaces that are actually online.
			if (iface.isUp()) {

				// Display name
				System.out.println("Interface name: " + iface.getDisplayName());

				// Interface addresses of the network interface
				System.out.println("\tInterface addresses: ");
				for (InterfaceAddress addr : iface.getInterfaceAddresses()) {
					System.out.println("\t\t" + addr.getAddress().toString());
				}

				// MTU (Maximum Transmission Unit)
				System.out.println("\tMTU: " + iface.getMTU());

				// Subinterfaces
				System.out.println("\tSubinterfaces: " + Collections.list(iface.getSubInterfaces()));

				// Check other information regarding the interface
				System.out.println("\tis loopback: " + iface.isLoopback());
				System.out.println("\tis virtual: " + iface.isVirtual());
				System.out.println("\tis point to point: " + iface.isPointToPoint());
			}
		}
	}

	public static StringBuilder limpaEspacos(StringBuilder fonte) {
		StringBuilder r = new StringBuilder();
		r.append(fonte.toString().replaceAll("\\n", "").replaceAll("\\r", ""));
		return r;
	}

	static String retNomeDeTabela(String fonte) {
		String nome = null;
		List<String> lista = ServicoUtil.filtro(fonte, "(?i)(create)+(\\s)+(table)+(.)+?\\(");
		if (lista != null) {
			nome = (lista.get(0).toUpperCase().replace("CREATE", "").replace("TABLE", "").replace("(", "").trim());
		}
		return nome;
	}

	public static List<String> filtro(String fonte, String padrao) {
		List<String> r = new ArrayList<String>();
		Pattern p = Pattern.compile(padrao);
		Matcher m = p.matcher(fonte);
		while (m.find()) {
			r.add(m.group());
		}
		return r;
	}

	static String capNome(String nome) {
		String nomeCap = nome.substring(0, 1).toUpperCase() + nome.toLowerCase().substring(1);
		return nomeCap;
	}

	public static String obtemTipoAtributo(final String tipo) {
		if (tipo.contains("VARCHAR")) {
			return "String";
		} else if (tipo.contains("INT")) {
			return "int";
		}
		return tipo;
	}

}
