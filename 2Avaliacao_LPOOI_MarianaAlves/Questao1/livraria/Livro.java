package livraria;

//Aluna: Mariana Alves
//Semestre:4�
//Curso: ADS
//Prova: 2 Avalia��o-LPOOI

//classe pr�-disponibilizada da prova sem altera��es
public class Livro {
	private String titulo;
	private String autor;

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public void exibirDetalhes() {
		System.out.println("T�tulo: " + titulo);
		System.out.println("Autor: " + autor);
	}
}
