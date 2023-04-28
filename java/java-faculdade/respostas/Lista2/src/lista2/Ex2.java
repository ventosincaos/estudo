package lista2;

import java.util.Scanner;
public class Ex2 {

	public void AlturaMaiorMenor(int quantidade){
		Scanner input = new Scanner(System.in);
		
		// assumindo que a altura será no formato: 1.70, 1.65, 1.50, 2.00, 2.10
		double alturaMaior= -1111111111111111.0;
		double alturaMenor=99999999999999.0;
		double altura;
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite a altura:");
			altura= input.nextDouble();
			//regra do maior
			if(altura > alturaMaior) {
				alturaMaior= altura;
			}
			
			//regra do menor
			if(altura < alturaMenor) {
				alturaMenor= altura;
			}
			
		}// fim for
		
		//chamada de método para imprimir maior e menor altura
		imprime(alturaMaior, alturaMenor);
		
	}// fim metodo
	
	public void imprime(double alturaMa, double alturaMe) {
		System.out.printf("\n\n*********************************\n");
		System.out.println("A maior altura: "+alturaMa);
		System.out.println("A menor altura: "+alturaMe);
	}
}
