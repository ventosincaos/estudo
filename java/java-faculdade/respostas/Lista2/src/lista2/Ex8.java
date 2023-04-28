package lista2;

public class Ex8 {

public void Fatorial(int A) {
		
		int resultado=A;
		for (int i = A-1; i >= 1; i--) {
			resultado= resultado * i;
		}
		
		System.out.println("Fatoria de:"+A + " é:"+ resultado);
	}
}
