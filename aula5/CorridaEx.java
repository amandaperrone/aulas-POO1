package aula5;

import java.util.ArrayList;

public class CorridaEx {
    public static void main(final String[] args) {

        final ArrayList<Carro> carros = new ArrayList<Carro>();
        final ArrayList<Carro> finalCorrida = new ArrayList<Carro>();
        final ArrayList<Carro> desclassificados = new ArrayList<Carro>();

        final int qtdCarros = 100;
        final int tamanhoPista = 10000;

        for (int i = 0; i < qtdCarros; i++) {
            final Carro c = new Carro();
            c.setCodigo(i);
            c.setConsumo(Math.random() * 10 + 5); // Sorteia entre 5 e 15
            c.abastecer(Math.random() * 45 + 5); // Sorteia entre 5 e 50
            carros.add(c);
        }

        // Tem carro na corrida ainda?
        while (carros.size() > 0) {
            // Mover todos os carros
            for (final Carro c : carros) {
                c.setVelocidadeKmPorHora(Math.random() * 200);

                // Conseguiu mover?
                if (c.moverEx(1) > 0) {
                    if (c.getDistanciaPercorridaEmMetros() > tamanhoPista) {
                        System.out.println("Carro " + c.getCodigo() + " terminou a corrida.");
                        finalCorrida.add(c);
                    }

                } else {
                    System.out.println("Carro " + c.getCodigo() + " desclassificado.");
                    desclassificados.add(c);
                }
            }

            // Remove os carros desclassificados ou que já terminaram a corrida
            carros.removeAll(finalCorrida);
            carros.removeAll(desclassificados);
        } // while

        System.out.println("CLASSIFICAÇÃO FINAL");
        int cont = 1;
        for (final Carro c : finalCorrida) {
            System.out.println(cont + "o. " + c.getCodigo());
            cont++;
        }

        System.out.println("DESCLASSIFICADOS");
        for (final Carro c : desclassificados)
        {
            System.out.println(cont + "o. " + c.getCodigo());
            cont++;
        }

    }
}
