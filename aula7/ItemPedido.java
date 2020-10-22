package aula7;

public class ItemPedido {
    
    private int numero;
    private double preco;
    private String produto;
    private int quantidade;

    // ----------------- MÉTODOS -----------------
    public double getTotalItem() {
        return preco * quantidade;
    }

    // ----------------- CONSTRUCTOR -----------------
    public ItemPedido(int numero, double preco, String produto, int quantidade) {
        this.numero = numero;
        this.preco = preco;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // ----------------- GETTERS AND SETTERS -----------------
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
