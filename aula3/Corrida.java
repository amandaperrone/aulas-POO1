package aula3;

public class Corrida {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        double distanciaPistaMetros = 10000;

        // Sorteia um valor para a velocidade do carro, entre 0 e 200
        while (c1.getDistanciaPercorridaEmMetros() <= distanciaPistaMetros && c2.getDistanciaPercorridaEmMetros() <= distanciaPistaMetros)
        {
            c1.velocidadeKmPorHora = Math.random() * 200;
            c1.mover(1);

            c2.velocidadeKmPorHora = Math.random() * 200;
            c2.mover(1);
        }

        if(c1.getDistanciaPercorridaEmMetros() > c2.getDistanciaPercorridaEmMetros())
        {
            System.out.println("C1 GANHOU");
        }
        else
        {
            System.out.println("C2 GANHOU");
        }
        System.out.println(c1);
        System.out.println(c2);
    }
}
