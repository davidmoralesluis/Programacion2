package Pruebas.Coleccion;

import Boletines.Boletin24.Libro;
import mylibreria.Intro;

import javax.swing.*;


/*
 * Implementa la clase comercio que contenga los métodos  agregar, eliminar,
 * obtener, buscar por código la cantidad de productos que tenemos en STOCK  *
 * añadir,mostrar ,eliminar,obtener,buscar codigo,
 */
public class MainComericio {
    public static void main(String[] args) {

        Comercio markt=new Comercio();
        int menu=0;

        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog("-- Comercio --\n\n1-> engadir producto\n2-> mostrar productos\n3-> eliminar producto\n4-> obtener producto\n5-> buscar por codigo\n0-> Salir"));
            switch (menu){

                case 1:markt.addProducto();
                    break;
                case 2:markt.mostrarProducto();
                    break;
                case 3:markt.eliminarProducto();
                    break;
                case 4:markt.obtenerProducto();
                    break;
                case 5:markt.buscarPorCodigo();
                    break;
                case 0:JOptionPane.showMessageDialog(null,"Fin de programa");
                    break;
                default:JOptionPane.showMessageDialog(null,"opcion invalida, vuelve intentarlo");
            }
        }while (menu!=0);

    }
}
