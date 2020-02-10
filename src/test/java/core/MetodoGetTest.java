package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gerador.nucleo.impl.MetodoGet;

public class MetodoGetTest {

	@Test
	public void testGeraGet() {
		MetodoGet m = new MetodoGet();
		String r = m.geraGet("BigInteger", "idPessoa");
		String mens = "public BigInteger getIdPessoa() {\n" + 
				"		return idPessoa;\n" + 
				"	}";
		System.out.println("1 - esperado - 2 gerado");
		System.out.println(mens);
		System.out.println(r);
		assertEquals(r, mens);
		
	}

}
