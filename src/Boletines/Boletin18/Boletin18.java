package Boletines.Boletin18;

import java.util.Scanner;

public class Boletin18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ConversorTemperaturas App = new ConversorTemperaturas();

        System.out.println("Introduce los grados Celsuis que quieres calcular");

        float celsius=sc.nextFloat();

        try {
            float fahren=App.centigradosAFharenheit(celsius);
            System.out.println(celsius +" centigrados son "+ fahren + " Fahrenheit");
        }catch (TemperaturaErradaExcepcion error){
            System.out.println(error.getMessage());
        }

        App.centigradosAReamur(celsius);
    }
}
