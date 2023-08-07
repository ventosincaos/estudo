package livraria;

//Aluna: Mariana Alves
//Semestre:4º
//Curso: ADS
//Prova: 2 Avaliação-LPOOI

//classe para Livro Tecnico
public class LivroTecnico extends Livro {
	private String area;

	public LivroTecnico(String titulo, String autor, String area) {
		super(titulo, autor);
		this.area = area;
	}

	// métodos get e set para Area
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	// exibir detalhes
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Área: " + area);
		System.out.println("======================================================");
	}
} // fim class