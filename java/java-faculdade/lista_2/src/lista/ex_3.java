package lista;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		int numerosPositivos = 0;
		int numerosNegativos = 0;
		int soma = 0;
		int valor;

		System.out.print("Digite o numero maximo para o contador: ");
		int contadorMaximo = scanner.nextInt();

		while (contador < contadorMaximo) {
			System.out.print("Digite um valor: ");
			valor = scanner.nextInt();

			if (valor > 0) {
				numerosPositivos++;
			} else if (valor < 0) {
				numerosNegativos++;
			}

			soma += valor;
			contador++;
		}

		if (contador > 0) {
			double media = (double) soma / contador;
			double percentualPositivos = (double) numerosPositivos / contador * 100;
			double percentualNegativos = (double) numerosNegativos / contador * 100;

			System.out.println("Media: " + media);
			System.out.println("Total de valores positivos: " + numerosPositivos);
			System.out.println("Total de valores negativos: " + numerosNegativos);
			System.out.printf("Porcentagem de valores positivos: %.2f%%\n", percentualPositivos);
			System.out.printf("Porcentagem de valores negativos: %.2f%%\n", percentualNegativos);
		} else {
			System.out.println("Nenhum valor foi informado.");
		}

	}
}
