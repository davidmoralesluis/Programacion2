package Pruebas.Array;

import javax.swing.*;
import java.util.*;

public class ExemploArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu=0;
        float [] notas = new float[5];
        MetodosArray obx = new MetodosArray();

        do {
            System.out.println("\n---MENU---\n1-> crear array\n2-> amosar array\n3-> buscar por nota\n4-> ordenar\n5->copiar\n6->borrar\n7->añadir\n8->sair\n");
            menu=scan.nextInt();

            if (menu==1){
                notas=obx.crearArray(notas);
            }

            if (menu==2){
                obx.amosarArray(notas);
            }

            if (menu==3){
                System.out.println("Esta en la posicion -> "+(MetodosArray.buscarElemento(notas,Float.parseFloat(JOptionPane.showInputDialog("Que nota quieres buscar??")))+1));
            }

            if (menu==4){
                //MetodosArray.ordenar(notas);
                MetodosArray.ordenar2(notas);
            }

            if (menu==5){
                notas=MetodosArray.copiarLlista(notas,Integer.parseInt(JOptionPane.showInputDialog("tamaño de la nueva lista??")));
            }

            if (menu==6){
                float elementoAborrar=Float.parseFloat(JOptionPane.showInputDialog("Que elemento quieres borrar?"));
                notas=MetodosArray.borrar(notas,MetodosArray.buscarElemento(notas,elementoAborrar));
            }

            if (menu==7){
                MetodosArray.engadir(notas);
            }

        } while (menu!=8);
        System.exit(0);
    }
}
