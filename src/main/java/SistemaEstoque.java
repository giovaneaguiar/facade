public class SistemaEstoque extends Subsistema{
    public boolean processarPedido(String pedido) {
        return pedido != null && !pedido.isEmpty();
    }
}
