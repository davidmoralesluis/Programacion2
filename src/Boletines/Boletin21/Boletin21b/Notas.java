package Boletines.Boletin21.Boletin21b;

public class Notas {
    public int[] cargarNotas(){

        int [] notas=new int[30];

        for (int i = 0; i < notas.length; i++) {
            notas[i]=(int)(Math.random()*11);
        }
        return notas;
    }

    public void visualizar(int[] notas){

        int aprobados=0;
        int suspensos=0;
        int max=0;
        float media=0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            media+=notas[i];

            if (notas[i]>max){
                max=notas[i];
            }

            if (notas[i]>=5){
                aprobados++;
            }else {
                suspensos++;
            }
        }

        System.out.println("Han aprobado "+aprobados+" alumnos, y "+suspensos+" alumnos han suspendido.");
        System.out.printf("La media de la clase es un %.1f\n",media/notas.length);
        System.out.println("La nota mas alta es un "+max);
    }
}


