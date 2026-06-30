/** Bebida concreta: cappuccino (café com leite). */
public class Cappuccino extends Bebida {

    @Override
    protected void prepararBebida() {
        System.out.println("Coando o café e preparando o leite...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando leite vaporizado e espuma.");
    }
}
