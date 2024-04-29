# Classe principal Veiculo
class Veiculo:
    # Método construtor
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.ligado = False

    # Método para ligar o veículo
    def ligar(self):
        self.ligado = True
        print(f"{self.marca} {self.modelo} ligado.")

    # Método para desligar o veículo
    def desligar(self):
        self.ligado = False
        print(f"{self.marca} {self.modelo} desligado.")

    # Método para acelerar o veículo
    def acelerar(self, velocidade):
        if self.ligado:
            print(f"{self.marca} {self.modelo} acelerando a {velocidade} km/h.")
        else:
            print(f"Não é possível acelerar, {self.marca} {self.modelo} está desligado.")

    # Método para parar o veículo
    def parar(self):
        print(f"{self.marca} {self.modelo} parado.")


# Classe Carro que herda de Veiculo
class Carro(Veiculo):
    # Método construtor
    def __init__(self, marca, modelo, ano, tipo):
        super().__init__(marca, modelo, ano)
        self.tipo = tipo

    # Método para abrir o porta-malas
    def abrir_porta_malas(self):
        print(f"{self.marca} {self.modelo} abrindo o porta-malas.")


# Classe Moto que herda de Veiculo
class Moto(Veiculo):
    # Método construtor
    def __init__(self, marca, modelo, ano, cilindradas):
        super().__init__(marca, modelo, ano)
        self.cilindradas = cilindradas

    # Método para ligar o farol
    def ligar_farol(self):
        print(f"{self.marca} {self.modelo} ligando o farol.")


# Instâncias das classes Carro e Moto
carro = Carro("Toyota", "Corolla", 2020, "Sedan")
moto = Moto("Honda", "CG 125", 2019, 125)

# Chamando métodos das classes Carro e Moto
carro.ligar()
carro.acelerar(60)
carro.abrir_porta_malas()
carro.parar()
carro.desligar()

moto.ligar()
moto.acelerar(50)
moto.ligar_farol()
moto.parar()
moto.desligar()
