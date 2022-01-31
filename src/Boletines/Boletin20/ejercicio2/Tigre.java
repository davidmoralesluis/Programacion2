package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio2.Felino;

public class Tigre extends Felino {
    @Override
    public void caminar() {
        System.out.println("El tigre puede caminar,...");
    }

    @Override
    public void nadar() {
        System.out.println("..y tambien sabe nadar");
    }
}
