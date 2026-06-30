/**
 * Classe abstrata que define o Template Method para o processamento de
 * pedidos em uma loja.
 * <p>
 * O método {@link #processarPedido()} fixa a sequência: calcular total,
 * processar pagamento e decidir a entrega. O cálculo do total é igual
 * para qualquer pedido e já vem implementado aqui. O processamento do
 * pagamento e a decisão de entrega variam conforme o tipo de pedido
 * (online, na loja, criptomoeda) e são deixados como abstratos.
 */
public abstract class Pedido {

    protected final double quantidade;
    protected final double valorItem;

    protected Pedido(double quantidade, double valorItem) {
        this.quantidade = quantidade;
        this.valorItem = valorItem;
    }

    /**
     * Método template (final para impedir que subclasses alterem a
     * sequência de passos do algoritmo).
     */
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
