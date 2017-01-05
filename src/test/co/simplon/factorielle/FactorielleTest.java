package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void comportementValeur1() {
		Factorielle valeurUn = new Factorielle ();
		
		long resultat = valeurUn.calculer(1);
		
		assertEquals(1, resultat);
	}

	
	
	
}
