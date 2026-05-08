import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;
public class TestBanco {
    @Test
    public void testAgregarCliente() {
        Queue<Cliente> cola = new LinkedList<>();
        Cliente cliente = new Cliente(
                "Kylian",
                "0822",
                "Deposito",
                "10:30"
        );
        cola.offer(cliente);
        assertEquals(1, cola.size());
    }
    @Test
    public void testAtenderCliente() {
        Queue<Cliente> cola = new LinkedList<>();
        Cliente cliente = new Cliente(
                "peña",
                "876453",
                "Retiro",
                "7:00"
        );
        cola.offer(cliente)
        Cliente atendido = cola.poll();
        assertNotNull(atendido);
    }
    @Test
    public void testColaVacia() {
        Queue<Cliente> cola = new LinkedList<>();
        assertTrue(cola.isEmpty());
    }
}
