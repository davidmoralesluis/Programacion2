package Boletines.Boletin21.Boletin21b;

public class Boletin21b {
    public static void main(String[] args) {

        Notas claseDAM= new Notas();
        int[] notasDAM= claseDAM.cargarNotas();
        claseDAM.visualizar(notasDAM);
    }
}
