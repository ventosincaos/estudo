package LojaEletronicos;

//Aluna: Mariana Alves
//Semestre:4º
//Curso: ADS
//Prova: 2 Avaliação-LPOOI

// classe celular
public class Celular implements Recarregavel {
	private String modelo;
	private int nivelBateria;

	public Celular(String modelo, int nivelBateria) {
		this.modelo = modelo;
		this.nivelBateria = nivelBateria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	@Override
	public void recarregar() {
    	System.out.println("-----------------------------------------");
		System.out.println("Este celular precisa de recarga pois");
		System.out.println("sua carga atingiu 20%");
		nivelBateria = 100;
	}

	@Override
	public boolean precisaRecarregar() {
		return nivelBateria < 21;
	}

	@Override
	public String toString() {
		return "=========================================" + "\n" + "CELULAR" + "\n" +
				"Informações do celular:" + "\n" +
				"modelo: " + modelo + "\n" +
				"Nível da bateria: " + nivelBateria + "%";
	}
}
