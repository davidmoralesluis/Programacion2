package Pruebas.Ficheros;

import Pruebas.Ficheros.LecturaFile.Lectura;
import Pruebas.Ficheros.escrituraFile.Escritura;

import java.io.File;
import java.util.Arrays;

public class MainFicheros {
    /*

     */
    public static void main(String[] args) {
        Lectura obxLectura = new Lectura();
        Escritura obxWirte = new Escritura();
        File numbers = new File("/home/dam1/IdeaProjects/Programacion2/src/Pruebas/Ficheros/numeros");
        File fichero = new File("/home/dam1/IdeaProjects/Programacion2/src/Pruebas/Ficheros/na");
        File players = new File("/home/dam1/IdeaProjects/Programacion2/src/Pruebas/Ficheros/Xogadores");

        //System.out.println(System.getProperty("os.name"));

        obxLectura.readLine(fichero);
        //obxLectura.readConLimit(fichero,",");

        //obxLectura.lerObxectos(players);


        //obxWirte.escribirNumeros("numInt.txt");
        //obxWirte.engadirNumeros("numEnterio.txt");
        //obxWirte.escribirBuffer("nomesBuff.txt");
       // obxWirte.escribirObxectos("escribirXogadores.txt");
       // obxLectura.lerObxectosMeterArray2("escribirXogadores.txt","\\s*,\\s*");

        obxWirte.escribirObxectos2("nomeXogadores",obxLectura.lerObxectosMeterArray(players,","));
    }
}
