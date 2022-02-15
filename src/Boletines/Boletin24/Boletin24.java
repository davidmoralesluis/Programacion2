package Boletines.Boletin24;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Boletin24 {
    public static void main(String[] args) {

        Libreria buecherei= new Libreria();
        int menu=0;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog("-- Librería --\n\n1-> engadir libros\n2-> vender (borrar) libros\n3-> amosar os libros\n4-> dar de baixa\n5-> consultar libro\n0-> Salir"));
            switch (menu){

                case 1: buecherei.addLibro();
                    break;
                case 2: buecherei.venderLibro();
                    break;
                case 3: buecherei.mostrarLibros();
                    break;
                case 4: buecherei.darDeBaixaLibro();
                    break;
                case 5: buecherei.consultasLibro();
                    break;
                case 0:JOptionPane.showMessageDialog(null,"Fin de programa");
                    break;
                default:JOptionPane.showMessageDialog(null,"opcion invalida, vuelve intentarlo");
            }
        }while (menu!=0);

    }
}
