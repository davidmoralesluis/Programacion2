package Boletines.Boletin21.Boletin21a;

public class Boletin21a {
    public static void main(String[] args) {

        Random6 vec=new Random6();

        int[] Array=vec.crearNumeros();

        for (int i = Array.length-1; i >= 0 ; i--) {
            System.out.println("Array ["+i+"] --> "+Array[i]);
        }
    }
}
