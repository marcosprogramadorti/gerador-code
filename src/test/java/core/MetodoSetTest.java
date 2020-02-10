package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gerador.nucleo.impl.MetodoSet;

public class MetodoSetTest {

	@Test
	public void testGeraSet() {
		MetodoSet m = new MetodoSet();
		String r = m.geraSet("BigInteger", "idPessoa");
		String mens = "public void setIdPessoa(BigInteger idPessoa) {\n" + 
				"		this.idPessoa = idPessoa;\n" + 
				"	}";
		System.out.println("1 - esperado - 2 gerado");
		System.out.println(mens);
		System.out.println(r);
		assertEquals(r, mens);
	}

}
