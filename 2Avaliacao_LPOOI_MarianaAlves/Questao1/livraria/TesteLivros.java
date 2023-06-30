package livraria; 

//Aluna: Mariana Alves
//Semestre:4º
//Curso: ADS
//Prova: 2 Avaliação-LPOOI

// classe para teste
public class TesteLivros {
	public static void main(String[] args) {
		
		System.out.println("======================================================");
		// teste LivroTecnico
		LivroTecnico livroTecnico = new LivroTecnico("Farmácia Clínica e Atenção Farmacêutica", "Paulo Caleb Júnior de Lima Santos", "Saúde");
		livroTecnico.exibirDetalhes();

		// teste LivroInfantil
		LivroInfantil livroInfantil = new LivroInfantil("Uma Nota Errada", "Gordon Korman", "Livre");
		livroInfantil.exibirDetalhes();
	}
}
