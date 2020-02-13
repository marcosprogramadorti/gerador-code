package core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gerador.nucleo.impl.Prestativo;

public class PrestativoTest {

	@Test
	public void testSobrepoeCodigoValor() {
		StringBuilder sb = new StringBuilder();
		StringBuilder resultado;
		StringBuilder esperado = new StringBuilder("A medida do amor é amar sem medida");
		sb.append("A @nome do amor é amar sem @nome");
		resultado = Prestativo.sobreporCodigoPorValor(sb,"@nome", "medida");
		System.out.println("resultado: " +  resultado);
		System.out.println("esperado : " +  resultado);
		assertEquals(resultado.toString(), esperado.toString());
		
	}

}
