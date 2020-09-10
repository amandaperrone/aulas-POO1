public class TesteCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.codigo = 100;

        c1.velocidadeKmPorHora = 100;
        c1.mover(10);

        c1.velocidadeKmPorHora = 50;
        c1.mover(5);

        c1.velocidadeKmPorHora = 80;
        c1.mover(4);
        
        System.out.println("O carro moveu " + c1.getDistanciaPercorridaEmMetros() + " metros.");
        /*
        System.out.println(c1.toString());
        System.out.println(c1.hashCode());
        System.out.println(c1.getClass().getName());
        System.out.println(c1.getClass().getSimpleName());
        */

        /* SUBSTITUIDO PELO OVERRIDE toString()
        System.out.println(c1.codigo);
        System.out.println(c1.velocidade);
        System.out.println(c1.distanciaPercorrida);
        */

    }
}
