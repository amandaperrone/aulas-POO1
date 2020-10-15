import java.util.ArrayList;

public class Teste3 {
    
    public static void main(String[] args) {
        
        ArrayList <Cliente> lista = new ArrayList<Cliente>();

        Cliente c1 = new Cliente(1, "Jose");
        lista.add(c1); // 0
        lista.add(new Cliente(2, "Maria")); // 1
        lista.add(c1); // 2
        lista.add(0, new Cliente(3, "João"));  // 3
        lista.add(c1); // 4

        // lista.containsAll(c) -> uma lista contém todos os itens de uma outra lista?

        System.out.println(lista.indexOf(c1));
        for (Cliente c: lista){
            System.out.println(c.getCodigo());
        }

        System.out.println(lista.lastIndexOf(c1));
        //System.out.println(lista.indexOf(c1));
    }
}
