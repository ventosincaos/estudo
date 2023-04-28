package lista2;

public class Ex1 {

	public int efetuaSomaImpares(int intervalo) {
		int SomaImpar=0;
		for (int i = 1; i < intervalo; i++) {
			if(i % 3==0 && i %2 ==1) {//regra pega múltiplo de 3 e impar
				SomaImpar= SomaImpar + i;
			}
		}
		
		return SomaImpar;
	}
	
	
	public void imprimeResultado() {
		
		int result= efetuaSomaImpares(500);
		
		System.out.println("Resultado:"+result);
		
		
	}
}
