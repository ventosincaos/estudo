package lista;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int numeroPar = 0;
		int numeroImpar = 0;
		int soma = 0;
		int somaPar = 0;
		int numero = -1;

		while (numero != 0) {
			System.out.print("Digite um valor (0 para sair): ");
			numero = scanner.nextInt();

			if (numero % 2 == 0 && numero != 0) {
				numeroPar++;
				somaPar += numero;
			} else if (numero != 0) {
				numeroImpar++;
			}

			soma += numero;
			contador++;
		}

		if (contador > 1) {
			float media = (float) soma / (contador - 1);
			float mediaPar = (float) somaPar / numeroPar;

			System.out.println("Total de numeros pares (considerando 0): " + numeroPar);
			System.out.println("Total de numeros impares: " + numeroImpar);
			System.out.printf("Media geral: %.2f\n", media);
			System.out.printf("Media numeros pares: %.2f\n", mediaPar);
		} else if (contador == 1) {
			System.out.println("Apenas 0 foi informado");
		} else {
			System.out.println("Nenhum valor foi informado.");
		}

	}
}
