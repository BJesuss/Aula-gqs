import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lib.Cliente;

public class Teste1 {

    @Test
    public void testeCliente() {
        Cliente cliente = new Cliente(0, "Marco", 10);
        System.out.println("Executando testeCliente()");
        assertEquals(0, cliente.getId());
        assertEquals("Marco", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
        assertNull(cliente.getGenero());
    }

    @Test
    public void testeDesconto() {
        Cliente cliente = new Cliente(1, "Thulio", 20);
        cliente.setDesconto(15);
        assertEquals(15, cliente.getDesconto());
    }

    @Test
    public void testeToString() {
        Cliente cliente = new Cliente(2, "Cacique", 30);
        assertEquals("Cacique(2)(30%)", cliente.toString());
    }
}
