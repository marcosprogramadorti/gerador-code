package core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gerador.nucleo.impl.Imports;
import com.gerador.nucleo.impl.MetodoGet;

public class ImportTest {

	@Test
	public void testGeraListDeImport() {
		Imports imp = new Imports();
		imp.novo("java.io.Serializable");
		imp.novo("java.math.BigInteger");
		imp.novo("javax.persistence.Column");
		imp.novo("javax.persistence.Entity");
		imp.novo("javax.persistence.Id");
		imp.novo("javax.persistence.Table");
		
		
		
		String r = imp.geraListDeImport();
		String mens = "import java.io.Serializable;\n" + 
				"import java.math.BigInteger;\n" + 
				"import javax.persistence.Column;\n" + 
				"import javax.persistence.Entity;\n" + 
				"import javax.persistence.Id;\n" + 
				"import javax.persistence.Table;" + "\n";
		System.out.println("1 - esperado");
		System.out.println(mens);
		System.out.println("2 - resultado");
		System.out.println(r);
		
		assertEquals(r, mens);
	}

	@Test
	public void testNovoImport() {
		Imports imp = new Imports();
		imp.novo("java.io.Serializable");
		imp.novo("java.math.BigInteger");
		
		String r = imp.geraListDeImport();
		String mens = "import java.io.Serializable;\n" + 
				"import java.math.BigInteger;\n"; 
				
		System.out.println("1 - esperado");
		System.out.println(mens);
		System.out.println("2 - resultado");
		System.out.println(r);
		
		assertEquals(r, mens);
		
	}

}
