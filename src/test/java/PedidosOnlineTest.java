import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidosOnlineTest {
    private FacadePedidosOnline facade;

    @BeforeEach
    void setUp() {
        facade = new FacadePedidosOnline();
    }

    @Test
    void testFazerPedidoOnline_ComPedidoValido() {
        String pedidoValido = "Produto A, Quantidade: 2, Endereço: Rua ABC";
        boolean resultado = facade.fazerPedidoOnline(pedidoValido);
        assertTrue(resultado, "O pedido online válido deve retornar verdadeiro.");
    }

    @Test
    void testFazerPedidoOnline_ComPedidoNulo() {
        String pedidoNulo = null;
        boolean resultado = facade.fazerPedidoOnline(pedidoNulo);
        assertFalse(resultado, "O pedido online nulo deve retornar falso.");
    }

    @Test
    void testFazerPedidoOnline_ComPedidoVazio() {
        String pedidoVazio = "";
        boolean resultado = facade.fazerPedidoOnline(pedidoVazio);
        assertFalse(resultado, "O pedido online vazio deve retornar falso.");
    }
}
