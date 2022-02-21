package Pruebas.Ficheros.LecturaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lectura {
    Scanner scan; //new Scanner(System.in);
    public void readLine(File fichero){
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

    public void readNome(File fichero){
        try {
            scan=new Scanner(fichero);
            while (scan.hasNext()){
                System.out.println(scan.next());   //next() lé hasta en espacio en blanco ó \n
            }
        }catch (FileNotFoundException error){
            System.out.println("error: "+error.toString());
        }finally {
            scan.close();
        }
    }

    public void readConLimit(File fichero,String limiter){
        try {
            scan= new Scanner(fichero).useDelimiter(limiter);//useDelimiter("\\s*"+limiter+"\\s*")
            while (scan.hasNext()){
                System.out.println(scan.next());
            }
        }catch (FileNotFoundException fail){
            System.out.println("error 1 "+ fail.getMessage());
        }finally {
            scan.close();
        }
    }

    public void amosarPares(File fichero){
        String cadea="";
        String [] lista;
        try {
            scan= new Scanner(fichero);//useDelimiter("\\s*"+limiter+"\\s*")
            while (scan.hasNextLine()){
                cadea+=scan.nextLine()+",";
            }
            lista=cadea.split(",");
            for (int i = 0; i < lista.length; i++) {
                if (Integer.parseInt(lista[i])%2==0){
                    System.out.println(lista[i]);
                }
            }
        }catch (FileNotFoundException fail){
            System.out.println("error 4 "+ fail.getMessage());
        }finally {
            scan.close();
        }
    }

    public void lerObxectos(File fichero){
        String cadea="";

        try {
            scan= new Scanner(fichero);
            while (scan.hasNextLine()){
                cadea=scan.nextLine();
                System.out.println(cadea);
            }

        }catch (FileNotFoundException fail){
            System.out.println("erro 5"+ fail.getMessage());
        }
        finally {
            scan.close();
        }

    }

    public ArrayList<Xogador> lerObxectosMeterArray(File fichero,String delimitador) {
        String cadea = "";
        ArrayList<Xogador> lista = new ArrayList<>();
        Xogador xo;
        try {
            scan = new Scanner(fichero);
            while (scan.hasNextLine()) {
                cadea = scan.nextLine();
                String[] linea = cadea.split(delimitador);
                xo = new Xogador(linea[0], Integer.parseInt(linea[1]));
                lista.add(xo);
            }
            for (Xogador x : lista) {
                System.out.println(x);
            }

        } catch (FileNotFoundException fail) {
            System.out.println("erro 5" + fail.getMessage());
        } finally {
            scan.close();
        }


        return lista;
    }




}
