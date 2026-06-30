public abstract class Bebida {
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
