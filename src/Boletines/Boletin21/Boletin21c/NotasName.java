package Boletines.Boletin21.Boletin21c;

import java.util.Arrays;
import java.util.Scanner;

public class NotasName {

    public void buscarNotaAlumno(String name,String[]listaName,int[]listaNotas) {
        boolean existe=false;

        for (int i = 0; i < listaName.length; i++) {
            if (name.equalsIgnoreCase(listaName[i])){
                System.out.println("El alumno "+name+" tiene un "+listaNotas[i]);
                existe=true;
                break;
            }
        }

        if (!existe){
            System.out.println("El alumno "+name+" no existe.");
        }
    }

    public void buscarNotaAlumnoPorTeclado(String[]name,int[]nota) {
        Scanner scan=new Scanner(System.in);
        boolean existe=false;
        String buscar="";
        System.out.println("Que Alumno quieres buscar?");
        buscar=scan.nextLine();

        for (int i = 0; i < nota.length; i++) {
            if (buscar.equalsIgnoreCase(name[i])){
                System.out.println("El alumno "+name[i]+" tiene un "+nota[i]);
                existe=true;
                break;
            }
        }
        if (!existe){
            System.out.println("El alumno "+buscar+" no existe.");
        }

    }

    public void ordenarLista(String[]name,int[]nota){
        int auxNota=0;
        String auxName="";

        System.out.println("start ord");
        for (int i = 0; i < nota.length-1 ; i++) {
            for (int j = (i+1); j < nota.length; j++) {
                if (nota[i]>nota[j]){
                    auxNota=nota[i];
                    nota[i]=nota[j];
                    nota[j]=auxNota;

                    auxName=name[i];
                    name[i]=name[j];
                    name[j]=auxName;
                }

            }
            System.out.println(name[i]+" -> "+nota[i]);
        }

        System.out.println("fin ord");
        // return name,nota;
    }

    public void alumnosAprobados(String[]name,int[]nota){
        System.out.println("Han aprobado los siguientes alumnos:");

        for (int i = 0; i < nota.length; i++) {
            if (nota[i]>=5){
                System.out.println("-"+name[i]);
            }
        }
    }

    public String[] asignarNombre(){
        String[] name=new String[30];

        for (int i = 0; i < name.length; i++) {
            name[i]=("Persona"+i).toString();
        }

        return name;
    }

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
