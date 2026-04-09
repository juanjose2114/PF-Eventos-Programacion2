package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.ClaseTestTest;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClaseTest {

    @Test
    public void funcionTest() {
        ClaseTestTest clas = new ClaseTestTest();
        int resultado = clas.metodoPrueba();
        assertEquals(1, resultado);
    }
}
