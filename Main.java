public class Main {

    public static void main(String[] args) {
        Bebida[] bebidas = { new Cafe(), new Cappuccino(), new Cha() };

        for (Bebida bebida : bebidas) {
            System.out.println("Preparando: " + bebida.getClass().getSimpleName());
            bebida.preparar();
            System.out.println("---");
        }
    }
}
