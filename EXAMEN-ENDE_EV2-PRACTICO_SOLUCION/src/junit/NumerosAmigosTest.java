package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testNumerosAmigos() {
		fail("Not yet implemented");
	}

	@Test
	public void testAmigoMal() {
		int n1=5,n2=6;
		NumerosAmigos na1=new NumerosAmigos(n1,n2);
		boolean valor=na1.amigo();
		assertFalse(valor);
	}
	
	@Test
	public void testAmigoPerfecto() {
		int n1=220,n2=284;
		NumerosAmigos na1=new NumerosAmigos(n1,n2);
		boolean valor=na1.amigo();
		assertTrue(valor);
	}

	@Test
	public void testEsCeroN1() {
		int n1=0,n2=6;
		NumerosAmigos na1=new NumerosAmigos(n1,n2);
		Integer valor=na1.esN1IgualAN2();
		assertNull(valor);
	}
	
	@Test
	public void testN1yN2SonIguales() {
		int n1=6,n2=6;
		Integer valorEsperado=0;
		NumerosAmigos na1=new NumerosAmigos(n1,n2);
		Integer valor=na1.esN1IgualAN2();
		assertEquals(valorEsperado,valor);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		int n1=2,n2=6;
		Integer valorNoEsperado=0;
		NumerosAmigos na1=new NumerosAmigos(n1,n2);
		Integer valor=na1.esN1IgualAN2();
		assertNotEquals(valorNoEsperado,valor);
	}

}
