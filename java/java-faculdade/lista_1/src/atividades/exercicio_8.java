package atividades;

import java.util.Scanner;

public class exercicio_8 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = sc.nextInt();

        int maior, medio, menor;

        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3) {
                medio = numero2;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3) {
                medio = numero1;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2) {
                medio = numero1;
                menor = numero2;
            } else {
                medio = numero2;
                menor = numero1;
            }
        }

        System.out.printf("Os numeros em ordem decrescente são: %d, %d, %d", maior, medio, menor);

        sc.close();
    }
}
