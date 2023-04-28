package atividades;

import java.util.Scanner; 

public class exercicio_11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int id;
        double nota1, nota2, nota3, me, ma;
        char resultado;
        
        System.out.print("Digite o numero de identificacao do aluno: ");
        id = input.nextInt();
        
        System.out.print("Digite a nota obtida na primeira verificacao: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a nota obtida na segunda verificacao: ");
        nota2 = input.nextDouble();
        
        System.out.print("Digite a nota obtida na terceira verificacao: ");
        nota3 = input.nextDouble();
        
        System.out.print("Digite a média dos exercícios: ");
        me = input.nextDouble();
        
        ma = (nota1 + nota2*2 + nota3*3 + me) / 7.0;
        
        System.out.printf("Aluno de número %d\n", id);
        System.out.printf("Notas: %.2f, %.2f, %.2f\n", nota1, nota2, nota3);
        System.out.printf("Media dos exercicios: %.2f\n", me);
        System.out.printf("Media de aproveitamento: %.2f\n", ma);
        
        if (ma >= 90.0) {
        	resultado = 'A';
            System.out.println("Conceito: " + resultado);
            System.out.println("Aprovado");
        } else if (ma >= 75.0) {
        	resultado = 'B';
            System.out.println("Conceito: " + resultado);
            System.out.println("Aprovado");
        } else if (ma >= 60.0) {
        	resultado = 'C';
            System.out.println("Conceito: " + resultado);
            System.out.println("Aprovado");
        } else if (ma >= 40.0) {
        	resultado = 'D';
            System.out.println("Conceito: " + resultado);
            System.out.println("Reprovado");
        } else {
        	resultado = 'E';
            System.out.println("Conceito: " + resultado);
            System.out.println("Reprovado");
        }
        
        input.close();
    }

}
