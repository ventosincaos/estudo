package atividades;

import java.util.Scanner;

public class exercicio_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu peso em kg: ");
		double peso = sc.nextDouble();

		System.out.println("Digite a sua altura em metros: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC e %.2f e sua condicao e ", imc);

		if (imc < 18.5) {
			System.out.println("abaixo do peso");
		} else if (imc < 25) {
			System.out.println("peso normal");
		} else if (imc < 30) {
			System.out.println("acima do peso");
		} else {
			System.out.println("obeso");
		}

		sc.close();
	}
}
