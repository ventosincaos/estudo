package lista;

public class ex_6 {
    public static void main(String[] args) {
    	
        int contador = 100;
        
        while (contador <= 200) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
    }
}