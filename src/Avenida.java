public class Avenida {
    private String nome;
    private Double tamanho;
    private int quantidadePistas;
    private int numeroVeiculos;

    public Avenida(String nome, Double tamanho, int quantidadePistas, int numeroVeiculos) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.quantidadePistas = quantidadePistas;
        this.numeroVeiculos = numeroVeiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadePistas() {
        return quantidadePistas;
    }

    public void setQuantidadePistas(int quantidadePistas) {
        this.quantidadePistas = quantidadePistas;
    }

    public int getNumeroVeiculos() {
        return numeroVeiculos;
    }

    public void setNumeroVeiculos(int numeroVeiculos) {
        this.numeroVeiculos = numeroVeiculos;
    }
}
