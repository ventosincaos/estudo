package alunosCursos;

//Aluna: Mariana Alves
//Curso: ADS
//Semestre: 4º

import java.util.Date;

public class AlunoGraduacao extends Aluno {
    private String curso;
    private String ensinoMedio;

    // Construtor
    public AlunoGraduacao(String nome, String ultimoNome, Date dataNascimento, String endereco, String curso, String ensinoMedio) {
        super(nome, ultimoNome, dataNascimento, endereco);
        this.curso = curso;
        this.ensinoMedio = ensinoMedio;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEnsinoMedio() {
        return ensinoMedio;
    }

    public void setEnsinoMedio(String ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Curso: " + curso + "\n" +
               "Ensino Médio: " + ensinoMedio;
    }
}

