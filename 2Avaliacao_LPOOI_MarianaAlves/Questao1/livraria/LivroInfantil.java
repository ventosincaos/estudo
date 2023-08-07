package livraria;

//Aluna: Mariana Alves
//Semestre:4º
//Curso: ADS
//Prova: 2 Avaliação-LPOOI

//classe para Livro Infantil
public class LivroInfantil extends Livro {
    private String faixaEtaria;

    public LivroInfantil(String titulo, String autor, String faixaEtaria) {
        super(titulo, autor);
        this.faixaEtaria = faixaEtaria;
    }

    // métodos get e set para faixa etária
    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    // exibir detalhes
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("======================================================");
    }
}// fim class