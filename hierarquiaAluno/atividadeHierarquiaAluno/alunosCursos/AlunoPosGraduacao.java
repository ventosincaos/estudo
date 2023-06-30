package alunosCursos;

//Aluna: Mariana Alves
//Curso: ADS
//Semestre: 4º

import java.util.Date;

public class AlunoPosGraduacao extends Aluno {
    private String graduacao;
    private String tipoPos;
    private String programa;

    // Construtor
    public AlunoPosGraduacao(String nome, String ultimoNome, Date dataNascimento, String endereco, String graduacao, String tipoPos, String programa) {
        super(nome, ultimoNome, dataNascimento, endereco);
        this.graduacao = graduacao;
        this.tipoPos = tipoPos;
        this.programa = programa;
    }

    // Getters e Setters
    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getTipoPos() {
        return tipoPos;
    }

    public void setTipoPos(String tipoPos) {
        this.tipoPos = tipoPos;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Graduação: " + graduacao + "\n" +
               "Tipo de Pós: " + tipoPos + "\n" +
               "Programa: " + programa;
    }
}
