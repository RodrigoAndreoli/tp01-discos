package ar.edu.unlam.programacionbasica2.discos;

import org.junit.Assert;
import org.junit.Test;

public class DiscosTest {

	@Test
	public void testParaVerPerimetroInterno () {
		Discos miDisco = new Discos (4.00, 9.00);
		Double perimIntEsperado = 4.00*Math.PI*2;
		Double perimIntObtenido = miDisco.getPerimetroInterior();
		Assert.assertEquals (perimIntEsperado, perimIntObtenido);
	}
	
	@Test
	public void testParaVerPerimetroInternoInvertido () {
		Discos miDisco = new Discos (10.00, 5.00);
		Double perimIntEsperado = 5.00*Math.PI*2;
		Double perimIntObtenido = miDisco.getPerimetroInterior();
		Assert.assertEquals (perimIntEsperado, perimIntObtenido);
	}
	
	@Test
	public void testParaVerPerimetroExterno () {
		Discos miDisco = new Discos (4.00, 9.00);
		Double perimExtEsperado = 9.00*Math.PI*2;
		Double perimExtObtenido = miDisco.getPerimetroExterior();
		Assert.assertEquals (perimExtEsperado, perimExtObtenido);
	}

	@Test
	public void testParaVerPerimetroExternoInvertido () {
		Discos miDisco = new Discos (10.00, 5.00);
		Double perimExtEsperado = 10.00*Math.PI*2;
		Double perimExtObtenido = miDisco.getPerimetroExterior();
		Assert.assertEquals (perimExtEsperado, perimExtObtenido);
	}
	
	@Test
	public void testParaVerSuperficie () {
		Discos miDisco = new Discos (9.00, 4.00);
		Double supEsperada = Math.pow((9.00*Math.PI), 2) - Math.pow((4.00*Math.PI), 2);
		Double supObtenida = miDisco.getSuperficie();
		Assert.assertEquals (supEsperada, supObtenida);
	}
	
}
