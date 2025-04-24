package teste;
import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import lib.Cliente;

public class Teste2 {

    @Test
    public void Testeconta(){
        Cliente cliente = new Cliente(1,"Marco",10);
        ContaCliente conta = new ContaCliente(1,cliente, 100.0);

        assertEquals(1, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(100.0, conta.getSaldo);
    }

    @Test
    public void testeSemSaldo(){
        Cliente cliente = new Cliente(2, "Thulio", 5);
        ContaCliente conta = new ContaCliente(2, cliente);

        assertEquals(2, conta.getId());
        assertEquals(cliente, conta.getCliente());
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void testAddDeposito() {
        Cliente cliente = new Cliente(3, "Cacique", 8);
        ContaCliente conta = new ContaCliente(3, cliente, 0.0);

        double novoSaldo = conta.addDeposito(150.0);
        assertEquals(150.0, novoSaldo);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    public void testSubSaldoComSaldoSuficiente() {
        ContaCliente conta = new ContaCliente(4, new Cliente(4, "Breno", 0), 200.0);
        double resultado = conta.subSaldo(50.0);

        assertEquals(150.0, resultado);
        assertEquals(150.0, conta.getSaldo());
    }

    @Test
    public void testSubSaldoComSaldoInsuficiente() {
        ContaCliente conta = new ContaCliente(5, new Cliente(5, "Leo", 0), 30.0);
        double resultado = conta.subSaldo(50.0);

        assertEquals(30.0, resultado);
        assertEquals(30.0, conta.getSaldo());
    }

    @Test
    public void testToString() {
        ContaCliente conta = new ContaCliente(6, new Cliente(6, "Guilherme", 0), 80.0);
        assertEquals("ID6Saldo: 80.0", conta.toString());
    }
}
