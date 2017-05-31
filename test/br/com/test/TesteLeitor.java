/**
 * 
 */
package br.com.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import br.com.core.FileHelperEngine;
import br.com.core.Piloto;



/**
 * @author roger
 *
 */
public class TesteLeitor {

	FileHelperEngine engine = null;
	String path = null;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		path = (new File(".").getAbsolutePath()).replace(".", "")+"test\\br\\com\\test\\log.txt";
		engine = new FileHelperEngine();
		
	}

	@Test
	public void retornoQuantidade() throws IOException, ParseException {
			
		Map<Integer,Piloto> map = engine.readResource(path);
		
		assertEquals(map.size(),6);
	}
	
	

}
