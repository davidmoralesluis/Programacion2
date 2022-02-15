package Pruebas.Ficheros;

import Pruebas.Ficheros.LecturaFile.Lectura;

import java.io.File;

public class MainFicheros {
    /*

     */
    public static void main(String[] args) {
        Lectura obxLectura = new Lectura();
        File fichero = new File("/home/dam1/IdeaProjects/Programacion2/src/Pruebas/Ficheros/nomes");
        File numbers = new File("/home/dam1/IdeaProjects/Programacion2/src/Pruebas/Ficheros/numeros");

        obxLectura.lerLine(numbers);
    }
}
