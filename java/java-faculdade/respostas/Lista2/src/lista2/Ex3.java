package lista2;

import java.util.Scanner;
public class Ex3 {

	public void Valores() {
		Scanner input = new Scanner(System.in);
		int positivo=0;
		int valor;
		int Total=0;
		int negativo=0;
		int sentinela=0;
		int contador=0; // guarda a qtd de valores negativo e positos digitiados
		System.out.print("Digite o valor para iniciar a sentinela:");
		 sentinela= input.nextInt();
		while (sentinela != 0)
		{
			System.out.print("Digite o valor:");
			 valor= input.nextInt();
			 if(valor > 0) {
				 positivo++;
				 contador++;
			 }
			 
			 if(valor < 0) {
				 negativo++;
				 contador++;
			 }
			 Total= Total + valor;
			 
			 sentinela= valor; // caso o usuario tenha digitado a condição de parada, nosso programa irá parar
		}// fim while
		
		//mostra valores
		imprime(positivo, negativo, Total, contador);
	}// fim metodo Valores
	
	
	public void imprime(int positivo, int negativo, int total, int quantidade) {
		
		double percPositivo= ((double)positivo / (double)quantidade) * 100;
		double percNegativo= ((double)negativo / (double)quantidade) * 100;
		System.out.printf("\n\n********************\n");
		System.out.println("Qtd de positivos:"+positivo);
		System.out.println("Percentual positivos:"+percPositivo);
		System.out.println("Qtd de negativos:"+negativo);
		System.out.println("Percentual negativos:"+percNegativo);
		System.out.println("Média:"+(double)total/(double)quantidade);
		
	}
}
