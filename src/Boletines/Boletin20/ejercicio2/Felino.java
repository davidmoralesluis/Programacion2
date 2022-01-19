package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio1.IPodeCaminar;
import Boletines.Boletin20.ejercicio1.Mamifero;

public class Felino extends Mamifero implements IPodeCaminar,IPodeNadar{
    @Override
    public void caminar() {
        System.out.println("El felino puede caminar,...");
    }

    @Override
    public void nadar() {
        System.out.println("y tambien sabe nadar!!");
    }
}
