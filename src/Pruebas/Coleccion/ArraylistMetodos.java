package Pruebas.Coleccion;

import mylibreria.Intro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistMetodos {

    public static ArrayList<Integer> engadir (ArrayList<Integer> lista){

        int valor = Integer.parseInt(JOptionPane.showInputDialog("Inroduce Int"));
        lista.add(valor);

        return lista;
    }

    public static void amosarLista(ArrayList<Integer>lista){
        System.out.println(lista);
    }

    public static void amosarIterator(ArrayList<Integer>lista){

        Iterator it= lista.iterator();
        Integer valor;

        while (it.hasNext()){
            valor= (Integer) it.next();
        }


    }
}
