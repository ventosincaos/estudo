package atividades;

import java.util.Scanner;

public class exercicio_10 {

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        double preco;
        int opcaoPagamento;
        
        System.out.print("Digite o preco do produto: ");
        preco = input.nextDouble();
        
        System.out.println("Escolha a opcao de pagamento:");
        System.out.println("1 - A vista em dinheiro ou cheque (10% de desconto)");
        System.out.println("2 - A vista no cartão de credito (15% de desconto)");
        System.out.println("3 - Em duas vezes sem juros");
        System.out.println("4 - Em duas vezes com juros de 10%");
        opcaoPagamento = input.nextInt();
        
        double precoFinal = 0;
        
        if(opcaoPagamento == 1) {
            precoFinal = preco * 0.9;
        } else if(opcaoPagamento == 2) {
            precoFinal = preco * 0.85;
        } else if(opcaoPagamento == 3) {
            precoFinal = preco / 2;
        } else if(opcaoPagamento == 4) {
            precoFinal = preco * 1.1 / 2;
        } else {
            System.out.println("Opcao de pagamento invalida!");
            return;
        }
        
        System.out.printf("Valor a ser pago: R$ %.2f", precoFinal);
        
        input.close();
    }
}
