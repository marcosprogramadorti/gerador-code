package core;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.gerador.nucleo.impl.Arquivo;

public class ArquitoTest {

	@Test
	public void testProduzir() {
		
		Arquivo a = new Arquivo();
		a.alterarNome("arquivo-caso-de-teste");
		a.alterarDiretorio("/home/marcos");
		StringBuilder conteudo = new StringBuilder();
		conteudo.append("Teste Realizado com sucesso em ").append( new Date());
		boolean adicionar = false;//subistitui o conteudo do arquivo existente
		try {
			boolean gerado = a.produzir(conteudo, adicionar);
			assertTrue(gerado);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
