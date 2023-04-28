package lista;

public class ex_1 {
	public int efetuaSomaImpares() {

			int contador = 1;
			int total = 0;
			
			
		while (contador < 500) {
			int resto = contador % 3;
			int impar = contador % 2; // se for 0 é par senao é impar
			
			if (resto == 0 && impar == 1) { // sou mutiplo de 3
				total = total + contador;
			}
			contador++;
		} // while
		return total;

	}// fim metodo

}