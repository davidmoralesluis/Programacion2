package Pruebas.Ficheros.LecturaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {
    Scanner scan; //new Scanner(System.in);
    public void lerLine(File fichero){
        String read;
        try {
            scan= new Scanner(fichero);
            while (scan.hasNextLine()){
                read=scan.nextLine();
                System.out.println(read);
            }
        }catch (FileNotFoundException fail){
            System.out.println("error 1 "+ fail.getMessage());
        }finally {
            scan.close();
        }

    }
}
