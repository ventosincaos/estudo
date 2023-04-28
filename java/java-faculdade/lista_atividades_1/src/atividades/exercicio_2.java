package atividades;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		String nome = "Juliana";
		char sexo = 'F';
		String estadoCivil = "CASADO";

		Scanner sc = new Scanner(System.in);

		if (sexo == 'F' && estadoCivil.equals("CASADO")) {
			System.out.println("O sistema identificou que " + nome + 
							 " e do sexo feminino e esta casada");
			System.out.println("Digite o tempo " + nome + "está casada (em anos): ");
			int tempoCasada = sc.nextInt();
			System.out.println(nome + " e casada ha " + tempoCasada + " anos.");
		} else {
			System.out.println(nome + " do sexo (" + sexo + ") possui o estado civil de " + estadoCivil);
		}

		sc.close();
	}
}