package dev.julia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ElementosComunesTest {

    @Test
    public void testBuscarElementosComunes() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        List<Integer> resultadoEsperado = Arrays.asList(3, 4, 5);
        List<Integer> resultadoObtenido = ElementosComunes.buscarElementosComunes(array1, array2);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testBuscarElementosComunesSinElementosComunes() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        List<Integer> resultadoEsperado = Arrays.asList();
        List<Integer> resultadoObtenido = ElementosComunes.buscarElementosComunes(array1, array2);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testBuscarElementosComunesConArraysVacios() {
        int[] array1 = {};
        int[] array2 = {};

        List<Integer> resultadoEsperado = Arrays.asList();
        List<Integer> resultadoObtenido = ElementosComunes.buscarElementosComunes(array1, array2);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testBuscarElementosComunesUnSoloElemento() {
        int[] array1 = {1};
        int[] array2 = {1};

        List<Integer> resultadoEsperado = Arrays.asList(1);
        List<Integer> resultadoObtenido = ElementosComunes.buscarElementosComunes(array1, array2);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}

