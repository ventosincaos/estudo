package lista2;

import java.util.Scanner;
public class Ex5 {
	public void CalpParImpar() {
		int SomaImpar=0;
		Scanner input = new Scanner(System.in);
		int i;
		int total=0;
		int impar=0;
		int par=0;
		int contador=0;
		System.out.print("Digite o valor:");
		i= input.nextInt();
		while (i !=0) {
			if(i % 2==0 ) {
				par++;
			}
			else
			{
				impar++;
			}
			total=total+i;
			contador++;
			System.out.print("Digite o valor:");
			i= input.nextInt();
		}//fim while
		
		imprime(impar, par,  contador, total);
	}
	
	
public void imprime(int impar, int par, int quantidade, int total) {
		
		double percImpar= ((double)impar / (double)quantidade) * 100;
		double percPar= ((double)par / (double)quantidade) * 100;
		System.out.printf("\n\n********************\n");
		System.out.println("Qtd de par:"+par);
		System.out.println("Percentual par:"+percPar);
		System.out.println("Qtd de impar:"+impar);
		System.out.println("Percentual impar:"+percImpar);
		
		System.out.println("Média:"+(double)total/(double)quantidade);
		
	}

}
