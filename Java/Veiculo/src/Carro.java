
public class Carro {

	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frea() {
		velocidade = velocidade /2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " + nome + "está numa velocidade de " + getVelocidade() + " Km/h");
	}
}
