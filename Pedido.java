public abstract class Pedido {

    protected final double quantidade;
    protected final double valorItem;

    protected Pedido(double quantidade, double valorItem) {
        this.quantidade = quantidade;
        this.valorItem = valorItem;
    }

    public final void processarPedido() {
        double total = calcularTotal();
        processarPagamento(total);
        decidirEntrega();
    }

    private double calcularTotal() {
        return quantidade * valorItem;
    }

    protected abstract void processarPagamento(double total);

    protected abstract void decidirEntrega();
}
