package Boletines.Boletin20.ejercicio1;

public class Gato extends Mamifero implements IPodeNadar {

    @Override
    public void caminar() {
        System.out.println("El Gato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El Gato tambien puede nadar");
    }
}
