package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio1.IPodeCaminar;
import Boletines.Boletin20.ejercicio2.Aves;

public class Avestruz extends Aves implements IPodeCaminar {
    @Override
    public void caminar() {
        System.out.println("El Avestruz solo camina");
    }
}
