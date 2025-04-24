import lib.Cliente;
import lib.FaturaCliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Teste3 {

    @Test
    public void testConstrutorCompleto() {
        Cliente cliente = new Cliente(1, "Marco", 10);
        FaturaCliente fatura = new FaturaCliente(101, cliente, 200.0);

        assertEquals(101, fatura.getId());
        assertEquals(cliente, fatura.getCliente());
        assertEquals(200.0, fatura.getValor());
    }

    @Test
    public void testConstrutorComIdApenas() {
        FaturaCliente fatura = new FaturaCliente(102);
        assertEquals(102, fatura.getId());
        assertNull(fatura.getCliente());
        assertEquals(0.0, fatura.getValor());
    }

    @Test
    public void testSetters() {
        FaturaCliente fatura = new FaturaCliente(103);
        Cliente cliente = new Cliente(2, "João", 20);

        fatura.setCliente(cliente);
        fatura.setValor(300.0);

        assertEquals(cliente, fatura.getCliente());
        assertEquals(300.0, fatura.getValor());
    }

    @Test
    public void testValorComDesconto() {
        Cliente cliente = new Cliente(3, "Ana", 25);
        FaturaCliente fatura = new FaturaCliente(104, cliente, 400.0);

        double esperado = 400.0 - (400.0 * 25 / 100.0);
        assertEquals(esperado, fatura.getValorComDesconto());
    }

    @Test
    public void testValorComDescontoSemCliente() {
        FaturaCliente fatura = new FaturaCliente(105);
        fatura.setValor(150.0);

        assertEquals(150.0, fatura.getValorComDesconto());
    }

    @Test
    public void testToString() {
        Cliente cliente = new Cliente(4, "Carlos", 15);
        FaturaCliente fatura = new FaturaCliente(106, cliente, 500.0);

        String resultado = fatura.toString();
        assertTrue(resultado.contains("id = 106"));
        assertTrue(resultado.contains("cliente ="));
        assertTrue(resultado.contains("valor = 500.0"));
    }
}
