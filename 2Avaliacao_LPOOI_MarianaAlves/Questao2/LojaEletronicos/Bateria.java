package LojaEletronicos;

//Aluna: Mariana Alves
//Semestre:4�
//Curso: ADS
//Prova: 2 Avalia��o-LPOOI


// classe bateria
public class Bateria implements Recarregavel {
    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public int getNivelCarga() {
        return carga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.carga = nivelCarga;
    }

    @Override
    public void recarregar() {
    	System.out.println("-----------------------------------------");
        System.out.println("Esta bateria precisa precisa de recarga");
        System.out.println("pois sua carga est� abaixo de 10%");
        carga = 100;
    }

    @Override
    public boolean precisaRecarregar() {
        return carga < 10;
    }

    @Override
    public String toString() {
        return  "\n" +"=========================================" + "\n" + "BATERIA" + "\n" +
        	   "A carga desta bateria est� com" + "\n" + "a porcentagem de carga em: " + carga + "%";
    }
}