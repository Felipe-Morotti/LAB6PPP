/**
 * Classe abstrata que define o Template Method para o preparo de bebidas.
 * <p>
 * O método {@link #preparar()} é o "esqueleto fixo" do algoritmo: a ordem
 * dos passos nunca muda. Os passos comuns a todas as bebidas (aquecer a
 * água, colocar na xícara) já vêm prontos aqui; os passos que variam de
 * bebida para bebida ({@link #prepararBebida()} e
 * {@link #adicionarCondimentos()}) são deixados como abstratos para que
 * cada subclasse concreta os implemente à sua maneira.
 */
public abstract class Bebida {

    /**
     * Método template (final para impedir que subclasses alterem a
     * sequência de passos do algoritmo).
     */
    public final void preparar() {
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
    }

    private void aquecerAgua() {
        System.out.println("Aquecendo a água...");
    }

    private void colocarNaXicara() {
        System.out.println("Colocando na xícara...");
    }

    protected abstract void prepararBebida();

    protected abstract void adicionarCondimentos();
}
