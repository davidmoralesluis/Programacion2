package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio1.IPodeCaminar;

public class Papagaio extends Aves implements IPodeCaminar, IPodeVoar {
    @Override
    public void caminar() {
        System.out.println("El Pagagaio camina pero no puede nadar,...");
    }

    @Override
    public void volar() {
        System.out.println("y tambien puede volar");
    }
}
