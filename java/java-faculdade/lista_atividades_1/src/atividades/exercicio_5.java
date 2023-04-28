package atividades;

import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        
        int resultado;
        
        if (numero >= 0) {
            resultado = numero * 2;
        } else {
            resultado = numero * 3;
        }
        
        System.out.println("O resultado é: " + resultado);
        
        sc.close();
    }

}

