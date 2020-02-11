package core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gerador.nucleo.impl.DefineTipo;

public class DefineTipoTest {

	@Test
	public void testEhFlot() {
		DefineTipo dt = new DefineTipo();
		String r = dt.retornaTipo("54544.454");
		System.out.println("Esperado  float: " + r);
		assertEquals(r, "float");

	}

	@Test
	public void testEhDouble() {
		DefineTipo dt = new DefineTipo();
		String r = dt.retornaTipo("545454455545555598885.554");
		System.out.println("Esperado double: " + r);
		assertEquals(r, "double");
	}
	@Test
	public void testEhLong() {
		DefineTipo dt = new DefineTipo();
		String r = dt.retornaTipo("545454455545555598885554");
		System.out.println("Esperado Long: " + r);
		assertEquals(r, "Long");
	}
	@Test
	public void testEhInt() {
		DefineTipo dt = new DefineTipo();
		String r = dt.retornaTipo("5454548885554");
		System.out.println("Esperado int: " + r);
		assertEquals(r, "int");
	}
	@Test
	public void testEhString() {
		DefineTipo dt = new DefineTipo();
		String r = dt.retornaTipo("5454548885d554");
		System.out.println("Esperado String: " + r);
		assertEquals(r, "String");
	}
	@Test
	public void testEhCpfString() {
		DefineTipo dt = new DefineTipo();
		String cpf= "706.194.371.34";
		String r = dt.retornaTipo(cpf);
		System.out.println("Esperado String: " + r);
		assertEquals(r, "String");
	}
	@Test
	public void testEhCepString() {
		DefineTipo dt = new DefineTipo();
		String cep= "72876-005";
		String r = dt.retornaTipo(cep);
		System.out.println("Esperado String: " + r);
		assertEquals(r, "String");
	}
	
	@Test
	public void testEhIdadeInt() {
		DefineTipo dt = new DefineTipo();
		String idade = "23";
		String r = dt.retornaTipo(idade);
		System.out.println("Esperado int: " + r);
		assertEquals(r, "int");
	
	}
	
	@Test
	public void testEhSaldoFlot() {
		DefineTipo dt = new DefineTipo();
		String saldo = "+25445,56";
		String r = dt.retornaTipo(saldo);
		System.out.println("Esperado  float: " + r);
		assertEquals(r, "float");

	}
	
	
	

}
