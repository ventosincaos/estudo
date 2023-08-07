package livraria;

//Aluna: Mariana Alves
//Semestre:4º
//Curso: ADS
//Prova: 2 Avaliação-LPOOI

//classe pré-disponibilizada da prova sem alterações
public class Livro {
	private String titulo;
	private String autor;

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public void exibirDetalhes() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
	}
}
