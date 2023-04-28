package atividades;

public class exercicio_6 {


    public static void main(String[] args) {
        
    	boolean valor1 = true;
    	boolean valor2 = false;
        
        if (valor1 && valor2) {
            System.out.println("Ambos os valores sao VERDADEIROS (true)");
        } else if (!valor1 && !valor2) {
            System.out.println("Ambos os valores sao FALSOS (false)");
        } else {
            System.out.println("Os valores sao diferentes");
        }
        
    }

}
