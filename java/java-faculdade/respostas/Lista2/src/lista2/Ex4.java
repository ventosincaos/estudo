package lista2;

import java.util.Scanner;
public class Ex4 {

	public void core() {
		Scanner input = new Scanner(System.in);
		
		int intervalate25=0;
		int intervala26ate50=0;
		int intervala51ate75=0;
		int intervala76ate100=0;
		int i;
		System.out.print("Digite o valor:");
		i= input.nextInt();
		while (i >=0 && i <=100) {
			
			if(i <=25) {
				intervalate25++;
			}
			else if (i <=50) {
				intervala26ate50++;
			}
			else if (i <=75) {
				intervala51ate75++;
			}
			else if (i<=100){
				intervala76ate100++;
			}
			
			System.out.print("Digite um novo valor:");
			i= input.nextInt();
			
		}//fim while
		imprime(intervalate25, intervala26ate50, intervala51ate75,  intervala76ate100 );
	}//fim metodo
	
	public void imprime(int intervalate25, int intervala26ate50, int intervala51ate75, int intervala76ate100 ) {
		System.out.printf("\n\n********************\n");
		System.out.println("Valores de 0 -- 25:"+intervalate25);
		System.out.println("Valores de 26 -- 50:"+intervala26ate50);
		System.out.println("Valores de 51 -- 75:"+intervala51ate75);
		System.out.println("Valores de 76 -- 100:"+intervala76ate100);
		
	}
	
}
