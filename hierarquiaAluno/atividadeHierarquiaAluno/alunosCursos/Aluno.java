package alunosCursos;

//Aluna: Mariana Alves
//Curso: ADS
//Semestre: 4º

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String ultimoNome;
    private Date dataNascimento;
    private String endereco;

    public Aluno(String nome, String ultimoNome, Date dataNascimento, String endereco) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Nome: " + nome + "\n" +
               "Sobrenome: " + ultimoNome + "\n" +
               "Data de Nascimento: " + dateFormat.format(dataNascimento) + "\n" +
               "Endereço: " + endereco;
    }
}
