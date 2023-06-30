package alunosCursos;

// Aluna: Mariana Alves
// Curso: ADS
// Semestre: 4º

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AlunoTeste {
    public static void main(String[] args) throws ParseException {
    	try {
			System.setOut(new PrintStream(System.out, true, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Permitir acentuação
    	
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Tipo de configuração para data

        // Objeto para Aluno.java
        Aluno aluno = new Aluno("Ana Alice", "Almeida", dateFormat.parse("11/01/2001"), "Rua Antares, Apartamento 1A");
        System.out.println("Dados do Aluno:");
        System.out.println(aluno.toString());
        System.out.println();

        // Objeto para AlunoGraduacao.java
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("Bruno", "Brito", dateFormat.parse("22/02/1992"), "Rua Barcelona, Bloco B2", "Biólogo", "Escola Estadual Bandeira Branca");
        System.out.println("Dados do Aluno de Graduação:");
        System.out.println(alunoGraduacao.toString());
        System.out.println();

        // Objeto para AlunoPosGraduacao.java
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao("Cris", "Campos", dateFormat.parse("03/03/1993"), "Condomínio Campo Silvestre, Conjunto C, Casa 3", "Ciências Contábeis", "Mestrado", "Controladoria Aplicada e Contabilidade Financeira");
        System.out.println("Dados do Aluno de Pós-Graduação:");
        System.out.println(alunoPosGraduacao.toString());
    }
}
