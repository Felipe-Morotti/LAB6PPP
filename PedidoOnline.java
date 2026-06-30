/** Pedido feito online: pagamento via cartão e entrega no endereço cadastrado. */
public class PedidoOnline extends Pedido {

    public PedidoOnline(double quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento via cartão processado online. Total: R$ %.2f%n", total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Pedido será entregue no endereço cadastrado.");
    }
}
