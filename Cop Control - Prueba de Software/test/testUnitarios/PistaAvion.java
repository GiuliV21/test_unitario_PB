package testUnitarios;

import org.junit.Assert;
import org.junit.Test;

import copControl.Posicion;

public class PistaAvion {
    @Test
	public void TestCrearPosicion() {
		int i = 0;
		int j = 1;
		Posicion posicion = new Posicion(i, j);
		Assert.assertEquals(posicion.getCoordenadaX(), i, 0);
		Assert.assertEquals(posicion.getCoordenadaY(), j, 0);
	}

	@Test
	public void TestPosicionesIguales() {
		int i = 0;
		int j = 1;
		Posicion posicion = new Posicion(i, j);
		Posicion posicion2 = new Posicion(i, j);
		Assert.assertEquals(posicion.igualA(posicion2), true);
	}
	
	@Test
	public void TestPosicionVecinaMinima() {
		Posicion posicion = new Posicion(0, 1);
		Posicion destino = new Posicion(9, 10);
		Posicion posicionEsperada = new Posicion(1, 2);
		Assert.assertEquals(posicion.getVecinoDeDistanciaMinima(destino).getCoordenadaX(), posicionEsperada.getCoordenadaX(), 0);
		Assert.assertEquals(posicion.getVecinoDeDistanciaMinima(destino).getCoordenadaY(), posicionEsperada.getCoordenadaY(), 0);
	}

	@Test
	public void TestDistanciaEntrePosiciones() {
		Posicion posicionA = new Posicion(0, 1);
		Posicion posicionB = new Posicion(0, 6);
		Assert.assertEquals(posicionA.distanciaHasta(posicionB), 5, 0);
	}
	
    
}
