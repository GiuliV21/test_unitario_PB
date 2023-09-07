package testUnitarios;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import avion.Avion;
import avion.AvionSimple;
import copControl.Mapa;
import copControl.Posicion;
import pista.Pista;
import pista.PistaSimple;

public class PistaTest {
    Avion avion;
    Mapa mapa;
    Pista pista;

    @Before
    public void setUp() throws Exception {
      
        Posicion posicionPista = new Posicion(0,0);
        Posicion posicionAvion = new Posicion(0,26);

        List<Pista> pistas = new ArrayList<Pista>();
        pista = new PistaSimple(posicionPista);
        pistas.add(pista);
        mapa = new Mapa(pistas);
        avion = new AvionSimple(posicionAvion, posicionPista ,mapa);
    }

    @Test
    public void fueraDeRadioaterrizaje() {
        assertFalse(pista.estaEnZonaAterrizaje(avion));
    }

}
