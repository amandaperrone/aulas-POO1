public class teste3 {
    public static void main(String[] args) {
        
        // Declaração de variáveis que irão guardar um endereço do objeto Casa
        Casa c1, c2, c3;
        
        // Construção do objeto Casa em c1
        c1 = new Casa();
        // Endereço do objeto Casa em c1 admite valor 'X'
        c1.endereco = "X";
        // C2 irá guardar o mesmo objeto que c1, que tem o endereço 'X'
        c2 = c1;
        // Cria-se um novo objeto Casa para c1 (com endereço e quantComodos null)
        c1 = new Casa();
        // Endereço do objeto Casa em c1 admite valor 'Y'
        c1.endereco = "Y";
        // C3 irá guardar o mesmo objeto que c1, que tem endereço 'Y'
        c3 = c1;
        // Cria-se um novo objeto Casa para c1 (com endereço e quantComodos null)
        c1 = new Casa();
        // Endereço do objeto Casa em c1 admite valor 'Z'
        c1.endereco = "Z";

        System.out.println(c1.endereco);
        System.out.println(c2.endereco);
        System.out.println(c3.endereco);
    }
}