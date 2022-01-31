package Pruebas.Array;

import javax.swing.*;

public class Bidimensionais {
    public static void main(String[] args) {

        int [][] taboa= new int[Integer.parseInt(JOptionPane.showInputDialog("Introduce Filas"))][Integer.parseInt(JOptionPane.showInputDialog("Introduce Columnas"))];
        int num=0;
        for (int i = 0; i < taboa.length; i++) {
            System.out.println();
            for (int j = 0; j < taboa[i].length; j++) {
                taboa[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduce ["+i+"]["+j+"]valor"));
                //System.out.printf("["+i+"]:["+j+"] --> "+taboa[i][j]+"\t");
            }
        }
        System.out.println();

        amosarResultadoTenis(taboa);
        
    }

    public static void amosarResultadoTenis(int [][]tabla){
        System.out.println("\t\t  1ºSet\t  2ºSet\t  3ºSet\t  4ºSet\t  5ºSet\t PuntosTotal");
        System.out.printf(JOptionPane.showInputDialog("Introduce 1º Jugador")+"\t\t");
        int total=0;
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf(tabla[0][i]+"\t\t");
            total+=tabla[0][i];
        }
        System.out.printf("%d",(total));
        total=0;
        System.out.println();
        System.out.printf(JOptionPane.showInputDialog("Introduce 2º Jugador")+"\t");
        for (int i = 0; i < tabla[1].length; i++) {
            System.out.printf(tabla[1][i]+"\t\t");
            total+=tabla[1][i];
        }
        System.out.printf("%d",(total));
    }
}
