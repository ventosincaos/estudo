package repeticao;

public class JurosCompostos {

	private double principal; // quantidade inicial antes dos juros
	private double taxa; // taxa de juros

//contrutor da classe
	public JurosCompostos(double principal, double taxa) {
		this.principal = principal;
		this.taxa = taxa;
	}

	public void calculaJuros() {
//exibe cabecalhos
		double amount; // quantia de deposito ao dim cada ano
		System.out.printf("%6s%30s\n", "Ano", "Montante em deposito");

//calcula a quantidade de depositos para cada
		for (int ano = 1; ano <= 10; ano++) {
//calcula nova quantidade durante ano especificado
			amount = principal * Math.pow(1.0 + taxa, ano); // calcula o expoente base expoente
			System.out.printf("%5d, %20.2f\n", ano, amount);
		}
	}// fim metodo calculaJuros
}