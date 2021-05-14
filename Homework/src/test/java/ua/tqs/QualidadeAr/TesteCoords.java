package ua.tqs.QualidadeAr;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCoords {

    Coords coords = new Coords(41.15, -8.61024); // Porto

    @Test
    public void testCoordsEquals(){
        Coords newCoords = new Coords(41.15, -8.61024);
        assertEquals(coords, newCoords);
    }

    @Test
    public void testCoordsNotEquals(){
        Coords newCoords = new Coords(0, 0);
        assertNotEquals(coords, newCoords);
    }

    @Test
    public void testHashCode(){
        Coords newCoords = new Coords(41.15, -8.61024);
        assertEquals(newCoords.hashCode(), coords.hashCode());
    }

    @Test
    public void testNotHashCode(){
        Coords newCoords = new Coords(0,0);
        assertNotEquals(newCoords.hashCode(), coords.hashCode());
    }

}
