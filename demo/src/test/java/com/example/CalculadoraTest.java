package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void deveSomarDoisNumeros() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }
}
