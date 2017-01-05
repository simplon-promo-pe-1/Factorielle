package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

	@Test
	public void leResultatDeFactorielleUnDoitEtreUn() {
		Factorielle valeurUn = new Factorielle ();
		long n=1;
		
		long resultat = valeurUn.calculer(n);
		
		assertEquals(1, resultat);
	}

	
	
	
}
