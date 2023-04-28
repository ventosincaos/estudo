package atividades;

import java.util.Scanner;

public class exercicio_4 {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();
        
        int c;
        
        if (a == b) {
            c = a + b;
            System.out.println("O resultado de a + b = " + c);
        } else {
            c = a * b;
            System.out.println("O resultado de a * b = " + c);
        }
        
        
        sc.close();
    }

}
