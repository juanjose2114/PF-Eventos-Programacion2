package co.edu.uniquindio.poo.model;

import static org.junit.Assert.*;
import java.util.logging.Logger;
import org.junit.Test;

/**
 * Clase para realizar un banco de pruebas para Asiento
 */
public class AsientoTest {

    private static final Logger LOG = Logger.getLogger(AsientoTest.class.getName());

    @Test
    public void datosNull(){
        LOG.info("Inicio prueba asiento datosNull");
        assertThrows(Throwable.class, () -> new Asiento(null, 1, 1));
        LOG.info("Fin prueba asiento datosNull");
    }

    @Test
    public void datosBlanck(){
        LOG.info("Inicio prueba asiento datosBlanck");
        assertThrows(Throwable.class, () -> new Asiento("", 1, 1));
        LOG.info("Fin prueba asiento datosBlanck");
    }

    @Test
    public void datosNegativos(){
        LOG.info("Inicio prueba asiento datosNegativos");
        assertThrows(Throwable.class, () -> new Asiento("1", -1, -1));
        LOG.info("Fin prueba asiento datosNegativos");
    }




}