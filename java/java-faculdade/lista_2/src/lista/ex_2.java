package lista;

import java.util.Scanner;

public class ex_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			int contador = 1;
			int menorAltura = 0;
			int maiorAltura = 0;
			

		System.out.println("Digite as alturas da pessoas abaixo em centimetros: ");
		System.out.printf("1 pessoa: ");
		int altura = scanner.nextInt();
		menorAltura = altura;
		maiorAltura = altura;

		
		while (contador < 15) {
			System.out.printf((contador + 1) + " pessoa: ");
			altura = scanner.nextInt();
			
			if (altura < menorAltura) {
				menorAltura = altura;
			} if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			contador++;
		}
		

		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		

	}
}
