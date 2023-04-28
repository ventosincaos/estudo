package lista;

import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        int contador = 1;
        int resultado = 1;

        while (contador <= numero) {
            System.out.print(contador);
            if (contador != numero) {
                System.out.print(" * ");
            }
            resultado *= contador;
            contador++;
        }

        System.out.printf(" = %d\n", resultado);
    }
}
