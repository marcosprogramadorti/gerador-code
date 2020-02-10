package core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gerador.nucleo.impl.Atributos;
import com.gerador.nucleo.tipos.Atributo;

public class AtributosTest {

	@Test
	public void testGeraListDeAtributos() {
		
		Atributos atributos = new Atributos();
		Atributo a1 = new Atributo();
		a1.setModificador("private");
		a1.setNome("cpf");
		a1.setTipo("String");
		
		Atributo a2 = new Atributo();
		a2.setModificador("private");
		a2.setNome("cep");
		a2.setTipo("String");
		
		atributos.novo(a1);
		atributos.novo(a2);
		String r = atributos.geraListDeAtributos();
		System.out.println("resultado: ");
		System.out.println(r);
		assertEquals(r.length(), (int) 40);
		
	}

}
