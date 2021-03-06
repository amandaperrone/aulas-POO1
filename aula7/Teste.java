package aula7;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Teste {

    
    public static void somaTodosPedidos(ArrayList<Cliente> clientes) {
        double soma = 0;

        for (Cliente cliente : clientes) {
            for (Pedido pedido : cliente.getPedidos()) {
                soma+= pedido.totalPedido();
            }
        }

        System.out.println("Soma Total 1 = " + soma);

    }

    // OPÇÃO 2 SOMA
    public static void somaTodosPedidos2(ArrayList<Cliente> clientes) {
        double soma = 0;

        for (Cliente cliente : clientes) {
            soma += cliente.somaTotalPedidos();
        }

        System.out.println("Soma Total 2 = " + soma);

    }

    public static void somaPedidosFechados(ArrayList<Cliente> clientes) {
        double soma = 0;

        for (Cliente cliente : clientes) {
            soma += cliente.somaTotalPedidosFechados();
        }

        System.out.println("Soma Total Fechados = " + soma);

    }

    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        Cliente c1 = new Cliente(1, "Jose", 2000);
        Cliente c2 = new Cliente(2, "Maria", 5000);

        clientes.add(c1);
        clientes.add(c2);

        Pedido p1 = new Pedido(1);
        p1.setDataPedido(LocalDateTime.now());
        p1.setDescricao("Pedido número 1");
        //p1.setValor(100);
        p1.setPedidoFechado(true);
        p1.addItemPedido(1, 10, "Bala", 10);

        Pedido p2 = new Pedido(2);
        p2.setDataPedido(LocalDateTime.now());
        p2.setDescricao("Pedido número 2");
        //p2.setValor(200);
        p2.addItemPedido(1, 10, "Bolo", 20);

        Pedido p3 = new Pedido(3);
        p3.setDataPedido(LocalDateTime.now());
        p3.setDescricao("Pedido número 3");
        //p3.setValor(300);
        p3.setPedidoFechado(true);
        p3.addItemPedido(1, 10, "Bolo", 20);
        p3.addItemPedido(1, 10, "Bala", 10);

        // Ainda não existe relação entre os objetos
        System.out.println("------------ Sem relação entre objetos");
        System.out.println(c1.getPedidos().size());
        System.out.println("Cliente do pedido 1 " + p1.getCliente());
        System.out.println("Cliente do pedido 2 " + p2.getCliente());
        System.out.println("---------------------------------------");


        // Estabelecendo relações entre os objetos
        p1.setCliente(c1);
        p2.setCliente(c1);
        p3.setCliente(c2);

        c1.addPedido(p1);
        c1.addPedido(p2);
        c2.addPedido(p3);

        System.out.println("------------ Estabelecendo relações");
        System.out.println(c1.getPedidos().size());
        System.out.println("Cliente do pedido 1 " + p1.getCliente());
        System.out.println("Cliente do pedido 2 " + p2.getCliente());
        System.out.println("Cliente do pedido 3 " + p3.getCliente());
        System.out.println("-----------------------------------");

        // Trocando o relacionamento
        
        /*
        p2.setCliente(c2);
        c2.getPedidos().add(p2); // Inconsistência, pois dois cliente possuem o mesmo pedido
        */

        c1.removePedido(p2);
        p2.setCliente(c2);
        c2.addPedido(p2);
        
        System.out.println("------------ Trocando relacionamento");
        System.out.println(c1.getPedidos().size());
        System.out.println(c2.getPedidos().size());
        System.out.println("Cliente do pedido 1 " + p1.getCliente());
        System.out.println("Cliente do pedido 2 " + p2.getCliente());
        System.out.println("Cliente do pedido 3 " + p3.getCliente());
        System.out.println("------------------------------------");

        
        System.out.println("------------ Somas");
        somaTodosPedidos(clientes);
        somaTodosPedidos2(clientes);
        somaPedidosFechados(clientes);
        System.out.println("-------------- FIM");

    }
}
