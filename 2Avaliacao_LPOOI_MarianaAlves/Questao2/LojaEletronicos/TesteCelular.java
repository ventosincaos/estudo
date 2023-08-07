package LojaEletronicos;

// Aluna: Mariana Alves
// Semestre:4º
// Curso: ADS
// Prova: 2 Avaliação-LPOOI

//classe para teste
public class TesteCelular {
	public static void main(String[] args) {
		
		System.out.println("=========================================");
		System.out.println("\n---------- PRECISAM DE RECARGA ----------\n");
		// exemplos que precisam de recarga
		Celular celularCargaBaixa = new Celular("iPhone XS", 20);
		Bateria bateriaCargaBaixa = new Bateria(9);

		System.out.println(celularCargaBaixa);
		if (celularCargaBaixa.precisaRecarregar()) {
			// menor que 21 o celular emite a mensagem
			celularCargaBaixa.recarregar();
		}
		System.out.println("=========================================");

		System.out.println(bateriaCargaBaixa);
		if (bateriaCargaBaixa.precisaRecarregar()) {
			// menor que 10 a bateria emite a mensagem
			bateriaCargaBaixa.recarregar();
		}
        System.out.println("=========================================");
        
        System.out.println("\n-------- NÃO PRECISAM DE RECARGA -------- \n");
        // exemplo que não precisa de recarga
        Celular celularCargaTotal = new Celular("Samsung s22", 21);
		Bateria bateriaCargaTotal = new Bateria(10);

		System.out.println(celularCargaTotal);
		if (celularCargaTotal.precisaRecarregar()) {
			// maior igual a 21 o celular emite a mensagem
			celularCargaTotal.recarregar();
		}
		System.out.println("=========================================");

		System.out.println(bateriaCargaTotal);
		if (bateriaCargaTotal.precisaRecarregar()) {
			// maior igual a 10 o celular emite a mensagem
			bateriaCargaTotal.recarregar();
		}
        System.out.println("=========================================");

	}
}