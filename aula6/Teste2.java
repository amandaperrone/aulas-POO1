//package aula6;

public class Teste2 {
    
    public static void main(String[] args) {
        
        Cliente c = null;

        //c.setCodigo(10); -> erro java.lang.NullPointerException
        //c.novoCliente(); -> funciona mas não é o ideal
        Cliente.novoCliente();

        System.out.println(c);
    }
}
