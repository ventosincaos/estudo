package livraria;

//Aluna: Mariana Alves
//Semestre:4�
//Curso: ADS
//Prova: 2 Avalia��o-LPOOI

//classe para Livro Infantil
public class LivroInfantil extends Livro {
    private String faixaEtaria;

    public LivroInfantil(String titulo, String autor, String faixaEtaria) {
        super(titulo, autor);
        this.faixaEtaria = faixaEtaria;
    }

    // m�todos get e set para faixa et�ria
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
        System.out.println("Faixa Et�ria: " + faixaEtaria);
        System.out.println("======================================================");
    }
}// fim class