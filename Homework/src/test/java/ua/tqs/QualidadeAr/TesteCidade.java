package ua.tqs.QualidadeAr;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCidade {
    Cidade cidade;

    @BeforeEach
    public void setUp(){
        cidade = new Cidade("Porto", "Porto", "Portugal", new Coords(41.15, -8.61024));
    }

    @Test
    public void testEquals(){
        Cidade cidade1 = new Cidade("Porto", "Porto", "Portugal", new Coords(41.15, -8.61024));
        Cidade cidade2 = cidade1;
        assertEquals(cidade, cidade1);
        assertEquals(cidade, cidade2);
        assertEquals(cidade1, cidade2);
    }

    @Test
    public void testNotEquals(){
        Cidade cidade1 = new Cidade("Porto", "Porto", "Portugal", new Coords(0, 0));
        Cidade cidade2 = new Cidade("Porto1", "Porto", "Portugal", new Coords(41.15, -8.61024));
        Cidade cidade3 = new Cidade("Porto", "Porto2", "Portugal", new Coords(41.15, -8.61024));
        assertNotEquals(cidade, cidade1);
        assertNotEquals(cidade, cidade2);
        assertNotEquals(cidade, cidade3);
    }

    @Test
    public void testCopy(){
        Cidade cidade1 = cidade.copy();
        assertEquals(cidade, cidade1);
    }

    @Test
    public void testHashCode(){
        Cidade cidade1 = cidade.copy();
        Cidade cidade2 = cidade1;
        assertEquals(cidade.hashCode(), cidade1.hashCode());
        assertEquals(cidade.hashCode(), cidade2.hashCode());
    }

    @Test
    public void testNotHashCode(){
        Cidade cidade1 = cidade.copy();
        cidade.setName("Avanca");
        cidade.setState("Aveiro");
        cidade.setCountry("Portugal");
        assertNotEquals(cidade.hashCode(), cidade1.hashCode());
    }

}
