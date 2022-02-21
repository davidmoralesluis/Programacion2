package Pruebas.Ficheros.escrituraFile;

/*
    Escritura en ficheros:
    cuando abrimos un fichero en modo escritura, si no existe --> lo crea;
    y si existe --> lo sobrescribe (borrando lo anterior);
    tambien podemos abrir fichero para añadir elementos, en este caso,
    si no existe y si existe --> el puntero se coloca en el ultimo registro para poder añadir el siguiente elemento;
 */


import Pruebas.Ficheros.LecturaFile.Xogador;

import java.io.*;

public class Escritura {

    FileWriter fichero;
    PrintWriter escribir;
    BufferedWriter buff;
    Xogador player;

    public void escribirNumeros(String nomeFichero){
        try {
            fichero = new FileWriter(nomeFichero); //false--> escribir, true--> añadir
            escribir = new PrintWriter(fichero);
            escribir.println(1);
            escribir.println(2);
            escribir.println(3);
            escribir.println(4);
            escribir.println(5);


            System.out.println("fichero creado con exito");
        }catch (FileNotFoundException fail){
            System.out.println("error en escritura"+ fail.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            escribir.close();
        }
    }

    public void engadirNumeros(String nomeFichero){
        try {
            fichero = new FileWriter(nomeFichero,true); //false--> escribir, true--> añadir
            escribir = new PrintWriter(fichero);
            escribir.println(0);
            escribir.println(20);
            escribir.println(30);
            escribir.println(40);
            escribir.println(50);


            System.out.println("fichero creado con exito");
        }catch (FileNotFoundException fail){
            System.out.println("error en escritura"+ fail.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            escribir.close();
        }
    }

    public void escribirBuffer(String inputfichero){

        try {
            fichero = new FileWriter(inputfichero,false);
            buff= new BufferedWriter(fichero);
            buff.write("aaaa\n");
            buff.write("bbbb\n");
            buff.write("cccc\n");

            System.out.println("arquivo creado");

        }catch (IOException fail){
            System.out.println("eror"+fail.getMessage());
        }
        finally {
            try {
                buff.close();
                fichero.close();
            }catch (IOException ex){
                System.out.println("no se puede cerrar");
            }
        }
    }

    public void escribirObxectos(String newfichero){
        try {
            fichero = new FileWriter(newfichero,false);
            escribir = new PrintWriter(fichero);


            player = new Xogador("zzzz",77);
            escribir.println(player);

            escribir.println(new Xogador("pppp",99));
            player= new Xogador("blabla",00);

            escribir.println(player.getNome()+","+player.getDorsal());

            System.out.println("Fichero creado con exito");

        }catch (IOException fail){
            System.out.println(fail.getMessage());
        }
        finally {
            try {
                fichero.close();
                escribir.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}//class
