package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RetanguloTest {

    @Test
    void deveCalcularAreaComSucesso() {
        //Dado
        Retangulo retangulo = new Retangulo(5, 10);

        //Quando
        int area = retangulo.calcularArea();

        //Entao
        assertEquals(60, area, "A área do retângulo deve ser largura * altura");
    }

    @Test
    void deveCalcularAreaComValoresUnitarios() {
        //Dado
        Retangulo retangulo = new Retangulo(1, 1);

        //Quando e Entao
        assertEquals(1, retangulo.calcularArea());
    }

    @Test
    void deveRetornarExcecaoSePassarValoresNegativos(){
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-1, -2));
    }
}