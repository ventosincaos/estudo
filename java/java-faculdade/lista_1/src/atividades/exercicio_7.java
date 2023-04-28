package atividades;

import java.util.Scanner;

public class exercicio_7 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        int resultado;

        if (num % 2 == 0) {
            resultado = num + 5;
        } else {
            resultado = num + 8;
        }

        System.out.println("O resultado da operação é: " + resultado);

        sc.close();
    }
}
