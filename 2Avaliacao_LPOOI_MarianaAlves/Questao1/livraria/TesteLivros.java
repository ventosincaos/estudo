package livraria; 

//Aluna: Mariana Alves
//Semestre:4�
//Curso: ADS
//Prova: 2 Avalia��o-LPOOI

// classe para teste
public class TesteLivros {
	public static void main(String[] args) {
		
		System.out.println("======================================================");
		// teste LivroTecnico
		LivroTecnico livroTecnico = new LivroTecnico("Farm�cia Cl�nica e Aten��o Farmac�utica", "Paulo Caleb J�nior de Lima Santos", "Sa�de");
		livroTecnico.exibirDetalhes();

		// teste LivroInfantil
		LivroInfantil livroInfantil = new LivroInfantil("Uma Nota Errada", "Gordon Korman", "Livre");
		livroInfantil.exibirDetalhes();
	}
}
