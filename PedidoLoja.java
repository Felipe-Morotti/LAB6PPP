/** Pedido feito na loja física: pagamento no caixa e retirada no local (sem entrega). */
public class PedidoLoja extends Pedido {

    public PedidoLoja(double quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento realizado no caixa da loja. Total: R$ %.2f%n", total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Sem entrega: cliente retira o pedido na loja.");
    }
}
