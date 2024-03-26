public class Carro {

    // Private members
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double quilometragem;
    private double preco;

    // Construtor
    public Carro (String marca, String modelo, int ano, String cor, double quilometragem, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.preco = preco;

    }

    // Métodos mebros público
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCor() {
        return cor;
    }

    public double getQuilometragem() {
        return this.quilometragem;
    }

    public double getPreco() {
        return this.preco;
    }
}
