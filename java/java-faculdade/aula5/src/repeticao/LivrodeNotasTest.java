package repeticao;

import ucb.LivrodeNotas;

public class LivrodeNotasTest {
	public static void main(String args[]) {
		LivrodeNotas objeto = new LivrodeNotas("ADS");
		objeto.inputNotas(5);
		objeto.mostrarNotas();
	}
}