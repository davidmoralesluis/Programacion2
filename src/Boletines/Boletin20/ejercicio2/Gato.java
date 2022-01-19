package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio1.IPodeCaminar;
import Boletines.Boletin20.ejercicio1.Mamifero;

public class Gato extends Mamifero implements IPodeCaminar, IPodeNadar {

    @Override
    public void caminar() {
        System.out.println("El Gato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El Gato tambien puede nadar");
    }
}
