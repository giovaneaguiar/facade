public class FacadePedidosOnline {
    private SistemaEstoque sistemaEstoque;
    private SistemaPagamento sistemaPagamento;
    private SistemaEntrega sistemaEntrega;

    public FacadePedidosOnline() {
        this.sistemaEstoque = new SistemaEstoque();
        this.sistemaPagamento = new SistemaPagamento();
        this.sistemaEntrega = new SistemaEntrega();
    }

    public boolean fazerPedidoOnline(String pedido) {
        boolean estoqueOK = sistemaEstoque.processarPedido(pedido);
        boolean pagamentoOK = sistemaPagamento.processarPedido(pedido);
        boolean entregaOK = sistemaEntrega.processarPedido(pedido);

        return estoqueOK && pagamentoOK && entregaOK;
    }
}
