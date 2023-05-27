package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveSomarPrecoCliente() {
        Cliente cliente = new Cliente();
        cliente.somarPreco(150.0f, 90.0f);
        assertEquals(240.0f, cliente.getPreco());
    }

    @Test
    void deveSubtrairPrecoCliente() {
        Cliente cliente = new Cliente();
        cliente.subtrairPreco(100.0f, 30.0f);
        assertEquals(70.0f, cliente.getPreco());
    }

    @Test
    void deveMultiplicarPrecoCliente() {
        Cliente cliente = new Cliente();
        cliente.multiplicarPreco(140.0f, 3.0f);
        assertEquals(420.0f, cliente.getPreco());
    }

    @Test
    void deveDividirPrecoCliente() {
        Cliente cliente = new Cliente();
        cliente.dividirPreco(220.0f, 2.0f);
        assertEquals(110.0f, cliente.getPreco());
    }

    @Test
    void naoDeveDividirPrecoClientePorZero() {
        try {
            Cliente cliente = new Cliente();
            cliente.dividirPreco(50000.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaPrecoCliente() {
        Cliente cliente = new Cliente();
        cliente.calcularMediaPrecos(90.0f, 50.0f);
        assertEquals(70.0f, cliente.getPreco());
    }
}