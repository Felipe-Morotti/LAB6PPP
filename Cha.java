public class Cha extends Bebida {

    @Override
    protected void prepararBebida() {
        System.out.println("Fazendo a infusão da erva...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando uma rodela de limão.");
    }
}
