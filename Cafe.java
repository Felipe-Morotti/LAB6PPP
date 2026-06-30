/** Bebida concreta: café simples. */
public class Cafe extends Bebida {

    @Override
    protected void prepararBebida() {
        System.out.println("Coando o café...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Sem condimentos adicionais.");
    }
}
