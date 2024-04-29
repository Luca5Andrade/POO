// Classe principal Veiculo
class Veiculo {
    // Atributos
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean ligado;

    // Método construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    // Método para ligar o veículo
    public void ligar() {
        this.ligado = true;
        System.out.println(this.marca + " " + this.modelo + " ligado.");
    }

    // Método para desligar o veículo
    public void desligar() {
        this.ligado = false;
        System.out.println(this.marca + " " + this.modelo + " desligado.");
    }

    // Método para acelerar o veículo
    public void acelerar(int velocidade) {
        if (this.ligado) {
            System.out.println(this.marca + " " + this.modelo + " acelerando a " + velocidade + " km/h.");
        } else {
            System.out.println("Não é possível acelerar, " + this.marca + " " + this.modelo + " está desligado.");
        }
    }

    // Método para parar o veículo
    public void parar() {
        System.out.println(this.marca + " " + this.modelo + " parado.");
    }
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {
    // Atributo específico de Carro
    private String tipo;

    // Método construtor
    public Carro(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    // Método para abrir o porta-malas
    public void abrirPortaMalas() {
        System.out.println(this.marca + " " + this.modelo + " abrindo o porta-malas.");
    }
}

// Classe Moto que herda de Veiculo
class Moto extends Veiculo {
    // Atributo específico de Moto
    private int cilindradas;

    // Método construtor
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    // Método para ligar o farol
    public void ligarFarol() {
        System.out.println(this.marca + " " + this.modelo + " ligando o farol.");
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Instâncias das classes Carro e Moto
        Carro carro = new Carro("Toyota", "Corolla", 2020, "Sedan");
        Moto moto = new Moto("Honda", "CG 125", 2019, 125);

        // Chamando métodos das classes Carro e Moto
        carro.ligar();
        carro.acelerar(60);
        carro.abrirPortaMalas();
        carro.parar();
        carro.desligar();

        moto.ligar();
        moto.acelerar(50);
        moto.ligarFarol();
        moto.parar();
        moto.desligar();
    }
}
