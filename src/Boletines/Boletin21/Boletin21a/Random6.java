package Boletines.Boletin21.Boletin21a;

public class Random6 {

    public int[] crearNumeros(){
        int [] num= new int[6];

        for (int i = 0; i < num.length; i++) {
            num[i]=((int)(Math.random()*50+1));
        }
        return num;
    }
}
