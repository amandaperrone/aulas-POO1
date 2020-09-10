public class Principal {

    public static void main(String[] args) {
        Bolo b1 = null;
        Bolo b2 = new Bolo();

        // Declaração uma variável b3 do tipo bolo
        Bolo b3;

        // Constrói o objeto e inicia o objeto
        // new => constrói o objeto
        b1 = new Bolo();

        // Iguala o 'endereço' de b3 a b1
        b3 = b1;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}