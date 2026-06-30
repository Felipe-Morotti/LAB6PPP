public class PedidoCripto extends Pedido {

    public PedidoCripto(double quantidade, double valorItem) {
        super(quantidade, valorItem);
    }

    @Override
    protected void processarPagamento(double total) {
        System.out.printf("Pagamento processado via criptomoeda. Total: R$ %.2f%n", total);
    }

    @Override
    protected void decidirEntrega() {
        System.out.println("Pedido será entregue após confirmação na blockchain.");
    }
}
