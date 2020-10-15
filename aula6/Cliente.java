//package aula6;

import java.time.LocalDate;

public class Cliente {

    private int codigo;
    private String nome;
    private double saldo;
    private LocalDate dataCadastro;

    public static Cliente novoCliente(){ //método estático pertence à Classe e não ao objeto. Pode ser chamado sem construir um objeto
        return new Cliente();
    }

    /*  SOBRECARGA DE MÉTODOS
        Dentro de uma classe há vários métodos com o mesmo nome, porém com 
        assinaturas diferentes.
    */

    // CONSTRUTOR
    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        dataCadastro = LocalDate.now();
    }

    public Cliente(int codigo){
        this.codigo = codigo;
        dataCadastro = LocalDate.now();
    }

    public Cliente(){
        dataCadastro = LocalDate.now();
    }

    // GETTERS, SETTERS, TO STRING
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", dataCadastro=" + dataCadastro + ", nome=" + nome + ", saldo=" + saldo
                + "]";
    }

   

}