// Classe concreta que implementa a interface Prototype
public class Carro implements Prototype {
    private String modelo;
    private String cor;

    // Construtor da classe Carro
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos getter e setter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Implementação do método clone
    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone(); // Utilizando o método clone da classe Object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo='" + modelo + '\'' + ", cor='" + cor + '\'' + '}';
    }
}
