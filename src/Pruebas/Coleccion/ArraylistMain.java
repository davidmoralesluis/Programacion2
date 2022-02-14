package Pruebas.Coleccion;

import mylibreria.Intro;

import java.util.ArrayList;

public class ArraylistMain {
    public static void main(String[] args) {

        ArrayList listaNum = new ArrayList();

        listaNum.add(3);
        listaNum.add(4);
        listaNum.add(3.6);
        listaNum.add("texto");

        for (int i = 0; i < listaNum.size(); i++) {
            System.out.println(listaNum);
        }

        Intro te=new Intro();

         ArrayList<Integer> listInt= new ArrayList<>();

        ArraylistMetodos.engadir(listInt);
        ArraylistMetodos.amosarLista(listInt);
    }
}
