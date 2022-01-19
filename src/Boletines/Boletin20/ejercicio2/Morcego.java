package Boletines.Boletin20.ejercicio2;

import Boletines.Boletin20.ejercicio1.IPodeCaminar;
import Boletines.Boletin20.ejercicio1.Mamifero;
import Boletines.Boletin20.ejercicio2.IPodeVoar;

public class Morcego extends Mamifero implements IPodeCaminar, IPodeVoar {
    @Override
    public void caminar() {
        System.out.println("El murcielago puede caminar,....");
    }

    @Override
    public void volar() {
        System.out.println(", tambien pude volar!!");
    }
}
