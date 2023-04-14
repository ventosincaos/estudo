package ucb;

import java.util.Scanner;

public class LivrodeNotas {

	private String Nomecurso;
	private int total;
	private int contaNotas;
	private int contaA;
	private int contaB;
	private int contaC;
	private int contaD;
	private int contaF;

	public LivrodeNotas(String Nomecurso) {
		this.Nomecurso = Nomecurso;
	}

	public LivrodeNotas() {
		super();
	}
	
	public int getContaNotas() {
		return contaNotas;
	}

	public void setContaNotas(int contaNotas) {
		this.contaNotas = contaNotas;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getContaA() {
		return contaA;
	}

	public void setContaA(int contaA) {
		this.contaA = contaA;
	}

	public int getContaB() {
		return contaB;
	}

	public void setContaB(int contaB) {
		this.contaB = contaB;
	}

	public int getContaC() {
		return contaC;
	}

	public void setContaC(int contaC) {
		this.contaC = contaC;
	}

	public int getContaD() {
		return contaD;
	}

	public void setContaD(int contaD) {
		this.contaD = contaD;
	}

	public int getContaF() {
		return contaF;
	}

	public void setContaF(int contaF) {
		this.contaF = contaF;
	}

	public void setNomecurso(String nomecurso) {
		Nomecurso = nomecurso;
	}

	public String getNomecurso() {
		return Nomecurso;
	}

	public void incrementaContadorNotas(int nota) {

		switch (nota / 10) {
		case 10:
		case 9:
			contaA++;
			break;
		case 8:
			contaB++;
			break;
		case 7:
			contaC++;
			break;
		case 6:
			contaD++;
			break;

		default:
			contaF++;
			break;
		}
	}

	public void inputNotas(int limite) {
		try (Scanner input = new Scanner(System.in)) {
			int cont;
			int recebeNota;
			this.setTotal(limite);
			for (cont = 1; cont <= limite; cont++)

			{
				System.out.printf("Digite a nota[%d]", cont);
				recebeNota = input.nextInt();
				this.incrementaContadorNotas(recebeNota);
			}
		}

	}

	public void mostrarNotas() {
		System.out.println("Nome do Curso:" + this.getNomecurso());
		System.out.println("Total de alunos:" + this.getTotal());
		System.out.println("Total de alunos com A:" + this.getContaA());
		System.out.println("Total de alunos com B:" + this.getContaB());
		System.out.println("Total de alunos com C:" + this.getContaC());
		System.out.println("Total de alunos com D:" + this.getContaD());
		System.out.println("Total de alunos com F:" + this.getContaF());
	}

}