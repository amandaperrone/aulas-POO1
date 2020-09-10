public class Carro {

    // Criação de atributos
    private int codigo;
    private double velocidadeKmPorHora;
    private double distanciaPercorridaEmMetros;

    //  Sobreescreve o toString() original
    @Override // Opcional
    public String toString() {
        return "Carro [ codigo=" + codigo + ", distanciaPercorrida=" + distanciaPercorridaEmMetros + ", velocidade=" + velocidadeKmPorHora
                + " ]";
    }

    void mover(double segundos){
        distanciaPercorridaEmMetros += (velocidadeKmPorHora*segundos/3600)*1000;
    }

    public double getDistanciaPercorridaEmMetros() {
        return distanciaPercorridaEmMetros;
    }

    public void setDistanciaPercorridaEmMetros(double distanciaPercorridaEmMetros) {
        this.distanciaPercorridaEmMetros = distanciaPercorridaEmMetros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getVelocidadeKmPorHora() {
        return velocidadeKmPorHora;
    }

    public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
        this.velocidadeKmPorHora = velocidadeKmPorHora;
    }

    
}