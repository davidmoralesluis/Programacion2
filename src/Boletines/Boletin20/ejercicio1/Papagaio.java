package Boletines.Boletin20.ejercicio1;

import Boletines.Boletin20.ejercicio2.Aves;
import Boletines.Boletin20.ejercicio2.IPodeVoar;

public class Papagaio implements IPodeCaminar{
    @Override
    public void caminar() {
        System.out.println("El Pagagaio camina pero no puede nadar,...");
    }

}
