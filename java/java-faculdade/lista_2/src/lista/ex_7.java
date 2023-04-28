package lista;

import java.util.Scanner;

public class ex_7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero de 1 a 10: ");
		int numero = scanner.nextInt();

		if (numero < 1 && numero > 10) {
			System.out.println("Erro, reinicie e digite um numero valido");
			return;
		}

		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", i, numero, i * numero);
		}
	}
}