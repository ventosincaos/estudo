package atividades;

import java.util.Scanner;


public class exercicio_3 {


	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite um numero para verificar se ele e impar ou par: ");
	        int numero = sc.nextInt();
	        
	        if (numero % 2 == 0) {
	            System.out.println("O numero " + numero + " e par.");
	        } else {
	            System.out.println("O numero " + numero + " e impar.");
	        }
	        
	        sc.close();
	    }

	}
