package Pruebas.Array;

import javax.swing.*;
import java.util.Arrays;

public class MetodosArray {

    public float[] crearArray(float[] lista){

        for (int i = 0; i < lista.length; i++) {
           lista[i]= Float.parseFloat(JOptionPane.showInputDialog(" teclea nota"));
        }
        return lista;
    }

    public void amosarArray(float [] lista){
        int menu=0;

        menu=Integer.parseInt(JOptionPane.showInputDialog("--MENU--\n 1-->FOR i\n 2-->FOR each\n 3-->clase Arrays"));

        switch (menu){
            case 1: for (int i = 0; i < lista.length; i++) {
                        System.out.println("nota "+ (i+1)+" --> "+lista[i]);
                    }break;

            case 2:
                    for (float elemento: lista) {
                        System.out.println(elemento);
                    } break;

            case 3:
                    System.out.println( Arrays.toString(lista));
                    break;
        }
    }

    public static int buscarElemento(float []lista,float key){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==key){
                return i;
            }
        }
        return -1;
        //return Arrays.asList(lista).contains(key);
    }

    public static float[] ordenar(float []lista){
        float aux;
        for (int i = 0; i < lista.length-1; i++) {
            for (int j = i+1; j < lista.length; j++) {
                if (lista[i]>lista[j]){
                  aux=lista[i];
                  lista[i]=lista[j];
                  lista[j]=aux;
                }
            }
        }
        System.out.println("ordenado");
        return lista;
    }

    public static void ordenar2(float []lista){
        Arrays.sort(lista);
        System.out.println("ordenado");
    }

    public static float[] copiarLlista(float[]lista,int newSize){
        return Arrays.copyOf(lista,newSize);
    }

    public static float[] borrar(float[]lista,int pos){
        if (pos!=-1){
            for (int i = pos; i < lista.length-1; i++) {
                lista[i]=lista[i+1];
            }
            lista=Arrays.copyOf(lista,lista.length-1);
        }
        return lista;
    }

    public static float[] engadir(float []lista){
        lista=Arrays.copyOf(lista,lista.length+1);
        lista[lista.length-1]=Float.parseFloat(JOptionPane.showInputDialog("Nueva nota?"));
        return lista;
    }





}
