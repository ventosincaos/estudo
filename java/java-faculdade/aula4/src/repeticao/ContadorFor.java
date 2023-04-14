package repeticao;

public class ContadorFor {
	public void conta() {

		int contador;
		for (contador = 0; contador < 10; contador++) {
			System.out.println("O valor do contador:" + contador);
		} // fim for
	} // fim metodo

	public void contaDecremento() {
		int contador;
		for (contador = 20; contador >= 1; contador--) {
			System.out.println("O valor do contador:" + contador);
		}
	}// fim novo metodo
} // fim classe